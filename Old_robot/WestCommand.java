package Old_robot;

public class WestCommand implements RobotCommand {
    @Override
    public void run(Robot robot) {
        robot.moveWest();
    }
}
