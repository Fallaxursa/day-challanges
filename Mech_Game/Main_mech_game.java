package Mech_Game;

import Utilities.User_input;

import java.util.Random;
import java.util.Scanner;

public class Main_mech_game {
    public static void main(String[] args) {
        Mech_game_controls controls = new Mech_game_controls();
        Mech_game_events events = new Mech_game_events();
        Mech_game_fight fight = new Mech_game_fight();
//        Scanner input = new Scanner(System.in);
        long seed = 1024649518; //turn off for randomness
        int currentNumb = 0;
        controls.printStats();

        Random generator = new Random();
        generator.setSeed(seed);



        while (!controls.gameOver) {

            String choice = User_input.AskForString("what do you want to do? ");
            if  (choice.equals("fuel")) {
                controls.addFuel(2);
            }
            if (choice.equals("stats")) { controls.printStats(); }
            if (choice.equals("explore") && controls.getFuel() > 0) {
                currentNumb = events.getRandomNumber(generator, 1, 10);
                controls.removeFuel(1);
                System.out.println("you have " + controls.getFuel());
            }
            if (controls.getFuel() <= 0){
                System.out.println("you dont have enough fuel(tip if you run out of fuel convert condition to fuel)");
            }
            if (choice.equals("emergency")) {
                System.out.println("you have converted 1 condition to 1 fuel");
                controls.addFuel(1);
                controls.removeCondition(1);
                System.out.println(STR."you have \{controls.getCondition()} and \{controls.getFuel()} fuel");
            }
            if (choice.equals("quit")) { controls.quit = true; controls.gameOver = true; }//quit doesnt give message yet

//            System.out.println(controls.getFuel());
//            System.out.println(currentNumb);
            switch (currentNumb) {
                case 1:
                    events.event1(); break;
                case 2:
                    events.event2(); break;
                case 3:
                    events.event3(); break;
                case 4:
                    events.event4(); break;
                case 5:
                    events.event5(); break;
                case 6:
                    events.event6(); break;
                case 7:
                    events.event7(); break;
                case 8:
                    events.event8(); break;
                case 9:
                    events.event9(); break;
                case 10:
                    events.event10(); break;
            }

//        System.out.println(events.getRandomNumber(generator,1, 10));
        }
    }
}
