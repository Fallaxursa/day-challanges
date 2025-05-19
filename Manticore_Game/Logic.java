package Manticore_Game;

import java.util.Scanner;

public class Logic {

    private int manticoreHealth = 10;
    private int cityHealth = 15;
    private int round = 1;
    private int manticoreDistance;

    public int getManticoreDistance() { return manticoreDistance; }

    public int getManticoreHealth() {
        return manticoreHealth;
    }

    public void setManticoreHealth(int manticoreHealth) {
        this.manticoreHealth = manticoreHealth;
    }

    public int getCityHealth() {
        return cityHealth;
    }

    public void setCityHealth(int cityHealth) {
        this.cityHealth = cityHealth;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public void initializeManticoreDistance() {
        this.manticoreDistance = askForNumberInRange("How far away is the manticore", 0, 100);
    }

    public boolean preAct() {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("STATUS: " + "ROUND: " + getRound() + " CITY: " + getCityHealth() + "/15" + " MANTICORE: " + getManticoreHealth() + "/10");

        setCityHealth(getCityHealth() - 1);
        System.out.println("the manticore deals 1 damage.");//red
        System.out.println("----------------------------");

        System.out.println("The cannon deals " + getCannonDamage(round) + " Damage");
        return playerDefeat();
    }

    public void act() {

        cannonResult();
    }

    public boolean postAct() {
        boolean manticoreDead = manticoreDefeat();
        setRound(getRound() + 1);
        return manticoreDead;
    }

    public boolean playerDefeat() {
        if (getCityHealth() <= 0) {
            System.out.println("The city fell, game over.");
            return true;
        }
        return false;
    }

    public boolean manticoreDefeat() {
        if (getManticoreHealth() <= 0) {
            System.out.println( "The manticore has been defeated!");//yellow
            return true;
        }
        return false;
    }

    private void cannonResult() {
        int CannonAim = askForNumberInRange("Where to target? ", 0, 100); //ask target
        if (CannonAim == getManticoreDistance()) { //aim result
            System.out.println("You hit the manticore!");//blue
            setManticoreHealth(getManticoreHealth() - getCannonDamage(getRound()));
        } else if (CannonAim < getManticoreDistance()) {
            System.out.println("You aimed too low");//red
        } else {
            System.out.println("You over shot");//yellow
        }
    }

    private static int getCannonDamage(int round) {
        if (round % 3 == 0 && round % 5 == 0) {
            return 10;
        } else if (round % 3 == 0 || round % 5 == 0) {
            return 3;
        } else {
            return 1;
        }
    }

    public static int askForNumberInRange(String text, int min, int max) { // advanced int input
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
}
