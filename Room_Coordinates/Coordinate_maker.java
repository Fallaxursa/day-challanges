package Room_Coordinates;

public class Coordinate_maker {
    private final int X;
    private final int Y;

    public int getX() { return X; }
    public int getY() { return Y; }

    Coordinate_maker(int X, int Y) {
    this.X = X;
    this.Y = Y;
    }

    public boolean isAdjacent(Coordinate_maker other) {
        return (this.getX() == other.getX() && Math.abs(this.getY() - other.getY()) == 1) ||
                (this.getY() == other.getY() && Math.abs(this.getX() - other.getX()) == 1);
    }

    public static void printResult(Boolean isAjacent) {
        if (isAjacent) {
            System.out.println("The cords are adjacent!");
        } else {
            System.out.println("The cords are NOT adjacent!");
        }
    }


}
