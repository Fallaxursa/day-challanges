package Mech_Game;

public class Mech_game_fight {
    Mech_game_controls controls = new Mech_game_controls();

    int currentTurn;

    //game start enemies spawn on 3 lanes and there are reinforcement lanes behind.
    // mech can attack one lane and defend another. modules can be bought to give bonuses
    //at the start of the battle random or pre place enmies on right left and middle slots
    public void fight() {
        System.out.println(STR."your condition is \{controls.getCondition()}/\{controls.getMaxCondition()}");
        System.out.println("on your left is a " + " in the middle a " + " and on the right is a ");
    }

    public void timeLine() {
    //timeline can see 5 turns ahead and enemy and player abilities sometimes need time to activate

    }
}
