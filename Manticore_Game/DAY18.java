package Manticore_Game;

import static Manticore_Game.Manticore_Game.AskForNumberInRange;
import static Manticore_Game.Manticore_Game.GetCannonDamage;

public class DAY18 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\\e[0;35m";

    public static void main(String[] args) {

        int ManticoreHealth = 10;
        int CityHealth = 15;
        int Round = 1;

        int ManticoreDistance = AskForNumberInRange("How far away is the manticore? ", 0, 100);

        while (CityHealth > 0 && ManticoreHealth > 0) { //status
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("STATUS: " + "ROUND: " + Round + " CITY: " + CityHealth + "/15" + " MANTICORE: " + ManticoreHealth + "/10");

            CityHealth -=1;

            if (CityHealth == -1) { //tmp break
                System.out.println(ANSI_RED + "The city is lost... GAME OVER." + ANSI_RESET);
                break;
            }

            int CannonDamage = GetCannonDamage(Round);
            System.out.println("The cannon deals " + CannonDamage + " Damage");


            int CannonAim = AskForNumberInRange("Where to target? ", 0, 100); //ask target

            if (CannonAim == ManticoreDistance) { //aim result
                System.out.println("You hit the manticore!");
                ManticoreHealth -= CannonDamage;
            } else if (CannonAim < ManticoreDistance) {
                System.out.println("You aimed too low");
            } else {
                System.out.println("You over shot");
            }

            if (ManticoreHealth <= 0) {
                System.out.println(ANSI_YELLOW + "The manticore has been defeated!");
                break;
            }

            Round++;

        }
    }
}
