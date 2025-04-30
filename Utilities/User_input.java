package Utilities;

import java.util.Scanner;

public class User_input {
//  put var name here = User_input.AskForNumber("put string here");
    public static int AskForNumber(String text) { //basic int input
        Scanner input = new Scanner (System.in);
        System.out.println(text + " ");
        int number = input.nextInt();
        return number;
    }

//  put var name here = User_input.AskForNumber("put string here");
    public static int AskForNumberInRange(String text, int min, int max) { // advanced int input
        Scanner input = new Scanner(System.in);
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

//   put var name here = User_input.AskForNumber("put string here");
    public static String AskForString(String text) {
        Scanner input = new Scanner (System.in);
        System.out.println(text + " ");
        String string = input.next();
        return string;
    }
}
