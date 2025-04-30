package Old_robot;

public class NorthCommand implements RobotCommand {
    public void run(Robot robot) {
        robot.moveNorth();
    }
}
