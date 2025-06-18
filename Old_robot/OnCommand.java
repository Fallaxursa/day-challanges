package Old_robot;

public class OnCommand implements RobotCommand {
    @Override
    public void run(Robot robot) {
        robot.powerOn();
    }
}
