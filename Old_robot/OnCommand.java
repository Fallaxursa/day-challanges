package Old_robot;

public class OnCommand implements RobotCommand{
    public void run(Robot robot) {
        robot.powerOn();
    }
}
