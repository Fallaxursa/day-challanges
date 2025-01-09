import java.awt.*;
import java.util.Scanner;


public class DAY8 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("the city is under attack where are the targets?");
        System.out.println("target row?");
        int row = input.nextInt();
        System.out.println("target column?");
        int column = input.nextInt();

        int Lrow = row - 1;
        int Rrow = row + 1;
        int Lcolumn = column - 1;
        int Rcolumn = column + 1;

        System.out.print(row);
        System.out.print(", ");
        System.out.println(column);

        System.out.println("the troops will deploy on! ");
//        left
        System.out.println(ANSI_BLUE + "left (" + Lrow + ", " + column + ")" );

//        right
        System.out.println("right (" + Rrow + ", " + column + ")");

//        up
        System.out.println("up (" + row + ", " + Rcolumn + ")");

//        down
        System.out.println("down (" + row + ", " + Lcolumn + ")" + ANSI_RESET);
        System.out.println("you have deployed troops!");
        Toolkit.getDefaultToolkit().beep();
        }
    }

