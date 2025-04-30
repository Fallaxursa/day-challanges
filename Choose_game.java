import Utilities.User_input;

public class Choose_game {


    public static void main(String[] args) {
        System.out.println("hello stranger, welcome to somewhere");
        String name = User_input.AskForString("what is your name? ");
        System.out.println("well met " + name);

        boolean LRDoor = false;

        System.out.println("you see a rusty ass looking hull with broken machinery.");
        System.out.println("and in front of you are 3 doors however the middle one seems to be higher up and has a long ramp going up to it.");
        System.out.println("while the doors to the sides look relatively untouched.");
        System.out.println("what do you want to do?");
        System.out.println("1. go up the ramp.");
        System.out.println("2. go to the left door");
        System.out.println("3. go to the right door");
        int choice_one = User_input.AskForNumberInRange("what do you want to do?", 1, 3);
        switch (choice_one) {
            case 1:
                System.out.println("you try with all your might to go up the ramp but ur as weak as a dead bush and keep falling down.");
                System.out.println("however after way too many hours you finally make it up to the ramp");
                System.out.println("quickly you notice that the door seemed to have been pried open a long time ago.(someone didn't like this particular door)");
                break;
            case 2:
                System.out.println("you go to the left door that seems to have barely been used.");
                System.out.println("being the dumbass you are, you pry the rusty ass door open as the darkness held back behind it consumes you.");
                LRDoor = true;
                break;
            case 3:
                System.out.println("you go to the right door, it looks brand new. but you are what people would call a fool so you rip and tear through the door letting the light flow out drawing you in.");
                LRDoor = true;
                break;
        }
        if (!LRDoor) {
            System.out.println("after going through the door you seem to have entered a control room, with rows of benched filled to the brim with dormant machinery");
            System.out.println("looking over the control panels. you can just barely see past the dirty glass, to see what looks to be a never ending dessert.");
        } else {
            System.out.println("you go through the door only to be met with what looks to be a broken down energy circulator. but that this oversized water bottle is doing down here is far beyond your thinking capacity.");
            System.out.println("looking behind you you realize the two doors literally lead to the same room");
        }
//        System.out.println("there is a broken door that looks to have been pried ope");
    }
}
