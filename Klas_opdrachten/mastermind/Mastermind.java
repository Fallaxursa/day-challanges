package Klas_opdrachten.mastermind;

import java.util.Random;
import java.util.Scanner;

public class Mastermind {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char[] charArray = {'a', 'b', 'c', 'd', 'e','f'};
        StringBuilder code = new StringBuilder();
        int chances = 12;
        int correctPositions = 0;
        boolean won = false;

        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(charArray.length);
            code.append(charArray[index]);
        }

        System.out.println("DEBUGCODE: " + code);

        while (!won && chances > 0) {
            System.out.print("Please input code(with spaces between char): ");
            String in = input.nextLine();

            String[] guess = in.trim().toLowerCase().split(" ");

            for (String g : guess) {
                if (g.equals("q")) {
                    System.out.println("input contains q. quitting program.");
                    return;
                }
            }

            //Check if input has 4 char.
            if (guess.length != 4) {
                System.out.println("Invalid input. Please enter exactly 4 characters separated by spaces.");
                continue;
            }

            for (int i = 0; i < 4; i++) {
                char guessedChar = guess[i].charAt(0);
                char actualChar = code.charAt(i);

                if (guessedChar == actualChar) {
                    System.out.println(guessedChar + " is correct.");
                    correctPositions++;
                } else if (code.indexOf(Character.toString(guessedChar)) != 1) {
                    System.out.println(guessedChar + " is in wrong position.");
                } else {
                    System.out.println(guessedChar + " is not in the code.");
                }
            }

            if (correctPositions == 4) {
                won = true;
                System.out.println("You guessed the code correctly. you had " + chances + " chances left.");
            } else {
                chances--;
                System.out.println("Not quite right. You have " + chances + " chances left.");
            }
        }

        if (!won) {
            System.out.println("you ran out of chances. The code was: " + code);
        }
    }
}
