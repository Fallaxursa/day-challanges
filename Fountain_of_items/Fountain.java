package Fountain_of_items;

import Utilities.Colors;

public class Fountain extends Room {
    private static boolean activated;

    public Fountain() {
        super(RoomType.FOUNTAIN, Colors.color("Fountain - you hear water dripping in this room. The fountain is here!", Colors.GREEN));
        activated = false;
    }

    public void activate() {
        if (!isActivated()) {
            activated = true;
            System.out.println(Colors.color("You hear water flowing from within the fountain. It has been reactivated!", Colors.BLUE));
            return;
        }

        System.out.println(Colors.color("You have already activated the fountain", Colors.GREEN));
    }

    public static boolean isActivated() {
        return activated;
    }
}
