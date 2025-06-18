package Old_robot;

public class EastCommand implements RobotCommand {
    @Override
    public void run(Robot robot) {
        robot.moveEast();
    }
}
