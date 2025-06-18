package Old_robot;

import java.util.Scanner;

public class Old_robot_day34 {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("The robot power switch is: " + robot.isPowered() + " \nPosition (X: " + robot.getX() + ", y: " + robot.getY() + ")");
            System.out.println("Enter command (on/off/north/east/south/west), or 'stop' to execute: ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("stop")) break;

            RobotCommand command = createCommand(input);
            if (command != null) {
                robot.addCommand(command);
            } else {
                System.out.println("Invalid command. Try again!");
            }
        }

        System.out.println("Executing comaaaaands!");
        robot.run();
        scanner.close();
    }

    private static RobotCommand createCommand(String input) {
        switch (input) {
            case "on": return new OnCommand();
            case "off": return new OffCommand();
            case "north": return new NorthCommand();
            case "east": return new EastCommand();
            case "south": return new SouthCommand();
            case "west": return new WestCommand();

            default: return null;
        }
    }
}
