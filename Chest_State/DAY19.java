package Chest_State;

import java.util.Scanner;

public class DAY19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Chest chest = new Chest();
        boolean loop = true;

        while (loop) {
            System.out.println("The chest is " + chest.getState());
            System.out.println("what do you want to do (Open, Close, Lock, Unlock, Quit)? ");
            String choice = input.next().toLowerCase();

            switch (choice) {
                case "open":
                    chest.open();
                    break;
                case "close":
                    chest.close();
                    break;
                case "lock":
                    chest.lock();
                    break;
                case "unlock":
                    chest.unlock();
                    break;
                case "quit":
                    System.out.println("till next time.");
                    System.out.println("");
                    System.out.println("quiting...");
                    loop = false;
                    break;
                default:
                    System.out.println("Nope, can't do that.");
                    break;
            }
        }
    }
}
