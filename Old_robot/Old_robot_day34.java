package Old_robot;

import java.util.Scanner;

public class Old_robot_day34 {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            System.out.println("The robot power switch is " + robot.isPowered() + " and is on y: " + robot.getY() + " and x: " + robot.getX());
            System.out.println("Enter command (on/off/north/east/south/west): ");
            String input = scanner.nextLine().trim().toLowerCase();

            RobotCommand command = createCommand(input);
            robot.getCommands()[i] = command;
        }

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
