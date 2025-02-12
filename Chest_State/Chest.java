package Chest_State;

public class Chest {
    enum ChestState{
        OPEN,
        CLOSED,
        LOCKED
    }

    private ChestState state;

    public Chest() {
        this.state = ChestState.CLOSED;
    }

    public void open() {
        if (state == ChestState.CLOSED) {
            state = ChestState.OPEN;
            System.out.println("The chest is now OPEN.");
        }
        else {
            System.out.println("You cant open it now.");
        }
    }

    public void close() {
        if (state == ChestState.OPEN) {
            state = ChestState.CLOSED;
            System.out.println("The chest is now CLOSED");
        }
        else {
            System.out.println("The chest cant be closed now.");
        }
    }

    public void lock() {
        if (state == ChestState.CLOSED) {
            state = ChestState.LOCKED;
            System.out.println("The chest is now LOCKED.");
        }
        else {
            System.out.println("You cant lock the chest now.");
        }
    }

    public void unlock() {
        if (state == ChestState.LOCKED) {
            state = ChestState.CLOSED;
            System.out.println("The chest is now UNLOCKED and CLOSED.");
        }
        else {
            System.out.println("You cant unlock the chest now.");
        }
    }

    public ChestState getState() {
        return state;
    }
}
