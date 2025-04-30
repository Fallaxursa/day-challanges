package Old_robot;

public class OffCommand implements RobotCommand{
    public void run(Robot robot) {
        robot.powerOff();
    }
}
