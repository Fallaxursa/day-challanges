package POINTS;

public class points {
    private final int Xpoint;
    private final int Ypoint;

//    constructor to make POINTS.points
    public points(int Xpoint, int Ypoint) {
        this.Xpoint = Xpoint;
        this.Ypoint = Ypoint;
    }

    public int getXpoint() {
        return Xpoint;
    }

    public int getYpoint() {
        return Ypoint;
    }

//    override to string
    public String toString() {
        return "(" + Xpoint + ", " + Ypoint + ")";
    }

}
