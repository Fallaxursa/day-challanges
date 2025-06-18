package Manticore_Game;

public class Manticore {
    public static void main(String[] args) {
        Logic logic = new Logic();
        logic.start();
//        logic.initializeManticoreDistance();
        while (true) { //status
            if (logic.preAct()) break;
            logic.act();
            if (logic.postAct()) break;

        }
    }
}
