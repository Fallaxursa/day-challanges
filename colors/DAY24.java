package colors;

public class DAY24 {
    public static void main(String[] args) {

    color customcolor = new color(97, 47, 224);

    color predefinedcolor = color.Yellow;
//        custom color
        System.out.println("Custom color:");
        System.out.println("Red: " + customcolor.getRed());
        System.out.println("Green: " + customcolor.getGreen());
        System.out.println("Blue: " + customcolor.getBlue());

        System.out.println("");
//        predefined color
        System.out.println("predefined color (yellow):");
        System.out.println("Red: " + predefinedcolor.getRed());
        System.out.println("Green: " + predefinedcolor.getGreen());
        System.out.println("Blue: " + predefinedcolor.getBlue());

    }
}
