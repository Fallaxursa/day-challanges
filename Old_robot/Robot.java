package Old_robot;

class Robot {
    private int x;

    private int y;

    private boolean isPowered = true;

    private RobotCommand[] commands = new RobotCommand[3];

    public int getX() { return x; }
    public int getY() { return y; }
    public boolean isPowered() { return isPowered; }
    public RobotCommand[] getCommands() { return commands; }

    public void moveNorth() { if (isPowered) y++; }
    public void moveSouth() { if (isPowered) y--; }
    public void moveEast() { if (isPowered) x++; }
    public void moveWest() { if (isPowered) x--; }
    public void powerOn() { isPowered = true; }
    public void powerOff() { isPowered = false; }


    public void run() {
        for (RobotCommand command : commands) {
            command.run(this);
            System.out.printf("[%d %d %b]\n", x, y, isPowered);
        }
    }
}
