package Old_robot;

public class SouthCommand implements RobotCommand {
    @Override
    public void run(Robot robot) {
        robot.moveSouth();
    }
}
