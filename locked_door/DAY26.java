package locked_door;

import Utilities.User_input;
import Utilities.Colors;
import colors.color;

public class DAY26 {
    public static void main(String[] args) {
        Door door = new Door();
        boolean loop = true;
        int DoorCode = 5678;
        int codeinput;

        while(loop) {
            System.out.println(Colors.color("the door is " + door.getState(),Colors.BLUE));
            System.out.println(Colors.color("(open, close, lock, unlock, change_passcode, quit)", Colors.GREEN));

            String choice = User_input.AskForString("what do you want to do? ");

            switch(choice) {
                case "open":
                    door.open();
                    break;
                case "close":
                    door.close();
                    break;
                case "lock":
                    door.lock();
                    break;
                case "unlock":
                    codeinput = User_input.AskForNumber("what is the passcode? ");
                    if (DoorCode == codeinput) {
                        door.unlock();
                        break;
                    }
                    else {
                        System.out.println(Colors.color("you cant unlock the door", Colors.RED));
                        break;
                    }
                case "change_passcode":
                    codeinput = User_input.AskForNumber("what is the passcode? ");
                    if (DoorCode == codeinput) {
                        DoorCode = User_input.AskForNumber("input new code: ");
                        break;
                    }
                    else {
                        System.out.println(Colors.color("that is not right", Colors.RED));
                        break;
                    }
                case "quit":
                    System.out.println("you quit...");
                    loop = false;
                    break;
            }
        }
    }
}
