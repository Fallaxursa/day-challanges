package locked_door;

import Utilities.Colors;

public class Door {
    enum DoorState{
        OPEN,
        CLOSED,
        LOCKED
    }


    private DoorState state;


    public Door() {this.state = DoorState.CLOSED;}

    public void open() {
        if (state == DoorState.CLOSED) {
            state = DoorState.OPEN;
            System.out.println(Colors.color("the door is now open", Colors.YELLOW));
        }
        else {
            System.out.println(Colors.color("you cant open the door", Colors.RED));
        }
    }

    public void close() {
        if (state == DoorState.OPEN) {
            state = DoorState.CLOSED;
            System.out.println(Colors.color("the door is now closed", Colors.YELLOW));
        }
        else {
            System.out.println(Colors.color("you cant close the door", Colors.RED));
        }
    }

    public void lock() {
        if (state == DoorState.CLOSED) {
            state = DoorState.LOCKED;
            System.out.println(Colors.color("the door is now locked", Colors.YELLOW));
        }
        else {
            System.out.println(Colors.color("you cant lock the door", Colors.RED));
        }
    }

    public void unlock() {
        if (state == DoorState.LOCKED) {
            state = DoorState.CLOSED;
            System.out.println(Colors.color("the door is now unlocked", Colors.YELLOW));
        }
    }

    public DoorState getState() {return state;}
}


