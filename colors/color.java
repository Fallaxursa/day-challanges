package colors;

public class color {
    private int red;
    private int green;
    private int blue;

    public color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
//    default black
    public color() {
        this(0, 0, 0);
    }

    public int getRed() {
        return this.red;
    }

    public int getGreen() {
        return this.green;
    }

    public int getBlue() {
        return this.blue;
    }

//  static final fields :)
    public static final color Red = new color(255, 0, 0);
    public static final color Green = new color(0, 128, 0);
    public static final color Blue = new color(0, 0, 255);
    public static final color Orange = new color(255, 105, 0);
    public static final color White = new color(255, 255, 255);
    public static final color Black = new color(0, 0, 0);
    public static final color Yellow = new color(255, 255, 0);
    public static final color Purple = new color(128, 0, 128);

    @Override //overrides the colors into readable numbers
    public String toString() {
        return "(" + red + ", " + green + ", " + blue + ")";
    }
}
