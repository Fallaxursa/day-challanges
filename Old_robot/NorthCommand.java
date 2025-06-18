package Old_robot;

public class NorthCommand implements RobotCommand {
    @Override
    public void run(Robot robot) {
        robot.moveNorth();
    }
}
