package Manticore_Game;

import java.util.Scanner;

public class Manticore_Game {

    public static int GetCannonDamage(int Round) {
        if (Round % 3 == 0 && Round % 5 == 0) {
            return 10;
        } else if (Round % 3 == 0 || Round % 5 == 0) {
            return 3;
        } else {
            return 1;
        }
    }

    public static int AskForNumberInRange(String text, int min, int max) { // advanced int input
        Scanner input = new Scanner (System.in);
        int number;

        while (true) {
            System.out.println(text + "(" + min + " to " + max + ")");
            number = input.nextInt();

            if (number >= min && number <= max) {
                return number;
            } else {
                System.out.println("that's invalid. please enter a number between " + min + " and " + max + ".");
            }
        }
    }
}
