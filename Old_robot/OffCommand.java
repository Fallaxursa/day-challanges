package Old_robot;

public class OffCommand implements RobotCommand {
    @Override
    public void run(Robot robot) {
        robot.powerOff();
    }
}
