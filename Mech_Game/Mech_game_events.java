package Mech_Game;

import Utilities.User_input;

import java.util.Random;
import java.util.Scanner;

public class Mech_game_events {
    Scanner input = new Scanner(System.in);
    Mech_game_controls controls = new Mech_game_controls();
    public int getRandomNumber(Random generator, int min, int max) {
        return (int) ((generator.nextFloat() * (max - min)) + min);
    }

    public void event1() {
        String EChoice1 = User_input.AskForString("what do you want to do?(retreat/dig deeper");
        if (EChoice1.equals("retreat")) {
            System.out.println("you flee");
        }
        if (EChoice1.equals(("dig"))) {
            System.out.println("you dig deeper and find 2 fuel and 5 scraps");
            controls.addFuel(2);
            controls.addScrap(5);
        }
    }

    public void event2() {

    }

    public void event3() {
        System.out.println("hello");
    }

    public void event4() {

    }

    public void event5() {

    }

    public void event6() {

    }

    public void event7() {

    }

    public void event8() {

    }

    public void event9() {

    }

    public void event10() {//shop
        System.out.println("As you were wondering the endless sea of yellow sand, You saw what looked to be a trail in the sand.\n" +
                "Follow it you see some wondering traders");
        String traderC1 = User_input.AskForString("what do you do?(trade/leave) ");
        if (traderC1.equals("trade")) {
            System.out.println("You look at their wares but find only a few items worth trading");
            int traderC2 = User_input.AskForNumberInRange("1. trader beacon. find them anywhere\n 2. fuel \n 3. ???", 1, 3);
            switch (traderC2){
                case 1:
                    System.out.println("how many? ");
                    input.nextInt();

            }
        } else {
            System.out.println("you left the traders alone");
        }
    }
}
