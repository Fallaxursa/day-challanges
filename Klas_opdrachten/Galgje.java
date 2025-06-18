package Klas_opdrachten;

import java.util.ArrayList;
import java.util.Scanner;

public class Galgje {

//    private static String[] words = {"word", "hello", "chickens", "hydrocloricphosphoresent", "soup", "sleep", "grass"};
    private static String[] words = {"word"};
    private static String word = words[(int) (Math.random() * words.length)];
    private static ArrayList<String> enteredWords = new ArrayList<String>();
    private static int turns = 25;
    private static char letter;
    private static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String hiddenWord = word.replaceAll("[a-z]", "_");


        while (count <= 7 || word.contains("_")) {
            System.out.println(word);
            System.out.print("Choose a letter: ");
            String guess = input.next().trim().toLowerCase();

            if (word.equals(guess)) {
                System.out.println("You guessed it immediately?");
                break;
            } else {
                guess = guess.substring(0,1);
            }

            System.out.println(guess);

            if (enteredWords.contains(guess)) {
                System.out.println("You already have that word!");
            } else {
                System.out.println("Letter entered!");
                enteredWords.add(guess);
            }

            if (hiddenWord.contains(guess)) {
                System.out.println("You guessed a valid letter");
                for (int i = 0; i < word.length(); i++) {
                    if (word.contains(guess)) {
                        System.out.println("YES");
                    }
                }
            }

            System.out.println(enteredWords);

            turns -= 1;
            System.out.println(turns);


            /*
            make array with words.
            choose random word from array.
            change all words to _
            make input. if the player inputs full correct word say you guessed correctly else take first letter.
            if player inputs wrong say false and add word to list
            if player correct use for loop in word and change word to correct word and add to list
            every time player guesses possible turns --1.



             */

        }
    }

    public static void hangmanImage() {
        if (count == 1) {
            System.out.println("Wrong guess, try again");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("___|___");
            System.out.println();
        }
        if (count == 2) {
            System.out.println("Wrong guess, try again");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 3) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   | ");
            System.out.println("___|___");
        }
        if (count == 4) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 5) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 6) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
        }
        if (count == 7) {
            System.out.println("GAME OVER!");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
            System.out.println("GAME OVER! The word was " + word);
        }
    }
}

