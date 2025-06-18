package Old_robot;

import java.util.ArrayList;
import java.util.List;

class Robot {
    private int x;

    private int y;

    private boolean isPowered = true;

    private List<RobotCommand> commands = new ArrayList<>();

    public int getX() { return x; }
    public int getY() { return y; }
    public boolean isPowered() { return isPowered; }

    public void moveNorth() { if (isPowered) y++; }
    public void moveSouth() { if (isPowered) y--; }
    public void moveEast() { if (isPowered) x++; }
    public void moveWest() { if (isPowered) x--; }
    public void powerOn() { isPowered = true; }
    public void powerOff() { isPowered = false; }
    public boolean quit() { return false; }

    public void run() {
        for (RobotCommand command : commands) {
            command.run(this);
            System.out.printf("Robot state: x = %d y = %d powered = %b\n", x, y, isPowered);
        }
    }

    public void addCommand(RobotCommand command) {
        if (command != null) {
            commands.add(command);
        }
    }
}
