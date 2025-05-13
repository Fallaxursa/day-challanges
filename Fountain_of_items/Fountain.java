package Fountain_of_items;

public class Fountain extends Room {
    private boolean activated;

    public Fountain() {
        super(RoomType.FOUNTAIN, "Fountain - you hear water dripping in this room. The fountain is here!");
        this.activated = false;
    }

    public void activate() {
        if (!activated) {
            activated = true;
            System.out.println("You hear water flowing from within the fountain. It has been reactivated!");
            return;
        }

        System.out.println("You have already activated the fountain");
    }

    public boolean isActivated() {
        return activated;
    }
}
