package Klas_opdrachten;

import java.util.Scanner;

public class Mijlen {
    public static void main(String[] args) { // STILL UNFINISHED :(
        // camelCase variables methods
        // Pascalcase only class

        Scanner input = new Scanner(System.in);
        float minutes = 0;
        float seconds = 0;

        System.out.print("fill distance in meters");
        int distance = input.nextInt();
        System.out.print("input hours");
        float inHours = input.nextFloat();
        System.out.print("input minutes");
        float inMinutes = input.nextFloat();
        System.out.print("input seconds");
        float inSeconds = input.nextFloat();

        minutes += inHours * 60;
        seconds += inMinutes + minutes * 60;

        System.out.println("m/h: " + (double) distance / seconds);

//        float outSpeed =
    }
}
