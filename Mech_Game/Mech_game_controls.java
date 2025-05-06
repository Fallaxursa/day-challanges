package Mech_Game;

public class Mech_game_controls {
    boolean gameOver = false;
    boolean quit = false;

    private double fuel = 5; //if 0 cant move
    private double maxFuel = 10;
    private double condition = 5; //health
    private double maxCondition = 10; // max is 10 can be upgraded at store for scrap
    private int scraps; //healing and currency
    private int maxScraps = 300;



//  mech has 10 health to heal 1 point takes 50 scrap enemies usually deal 1 for weak and 3 for strong attacks

    public double getFuel() { return fuel; }
    public double getMaxFuel() { return maxFuel; }
    public double getCondition() { return condition; }
    public double getMaxCondition() { return  maxCondition; }
    public int getScraps() { return scraps; }
    public int getMaxScraps() { return maxScraps; }

    public void setFuel(double Fuel) { this.fuel = Fuel; }
    public void setMaxFuel(double maxFuel) { this.maxFuel = maxFuel; }
    public void setCondition(double Condition) { this.condition = Condition; }
    public void setMaxCondition(double maxCondition) { this.maxCondition = maxCondition; }
    public void setScraps(int Scrap) { this.scraps = Scrap; }
    public void setMaxScraps(int maxScraps) { this.maxScraps = maxScraps; }

    public void addFuel(double addedFuel) { if(fuel <= maxFuel && addedFuel <= maxFuel) {
        setFuel(fuel + addedFuel);
//        System.out.println(STR."Added \{addedFuel} fuel for a total of \{getFuel()}");
        } else System.out.println("too full");
    }

    public void removeFuel(double removedFuel) { if(fuel >= 1)
    setFuel(fuel - removedFuel);
//        System.out.println(STR."Removed \{removedFuel} with \{fuel} remaining");
    }

    public void addScrap(int addedScrap) {
        setScraps(scraps + addedScrap);
//        System.out.println("Added " + addedScrap + " scrap for a total of " + getScraps());
    }

    public void addCondition(int addCondition) {
        if (condition < maxCondition) {setCondition(condition + addCondition);}
    }

    public void removeCondition(int removeCondition) {
        if (condition <= 1) return;
        setCondition(condition - removeCondition);
    }

    private float calculatePercent() { //unfinished :(
        double precentFloat = getMaxCondition() / 100;
        double outValueFloat = (getCondition() * precentFloat);
        return Math.round(outValueFloat);
    }
    public void printStats() {
        System.out.println("Your hull ");
        System.out.println("You have: " + getFuel() + " fuel.");
        System.out.println("You have: " + getScraps() + " scraps.");
        System.out.println(calculatePercent());
    }

    public void gameOver() {
        if (condition <= 0) System.out.println("your mech was destroyed");
        if (quit == true) System.out.println("goodbye");//quit is FAKE :(
         // maybe add situational death flags
        gameOver = true;
    }
}
