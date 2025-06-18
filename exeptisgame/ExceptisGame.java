package exeptisgame;

import java.util.*;

public class ExceptisGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> usedNumbers = new ArrayList<>();
        int secret = new Random().nextInt(9);
        boolean player = true;

        /*
        where's the exeption?????? i dont see it.
         */
        while (true) {
            if (player == true) {
                System.out.print("Enter number between 0-9 Player 1: ");
            } else {
                System.out.print("Enter number between 0-9 Player 2: ");
            }
            int guess = input.nextInt();

            System.out.println(guess);

            if (usedNumbers.contains(guess)) {
                System.out.println("nuh uh");
                continue;
            }

            usedNumbers.add(guess);
            player = playerSwitch(player);

            if (usedNumbers.contains(secret)) {
                System.out.println("You ate the discusting cookie you lose");
                break;
            }

            if (!usedNumbers.contains(secret) && usedNumbers.size() == 9) {
                if (player == true) {
                    System.out.println("You did not take the cookie. you win player 1!");
                } else {
                    System.out.println("You did not take the cookie. you win player 2!");
                }
                break;
            }
        }
    }

    public static boolean playerSwitch(boolean player) {
        if (player == true) {
            return player = false;
        } else {
            return player = true;
        }
    }
}
