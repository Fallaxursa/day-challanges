package arrows;

import java.util.Scanner;

import static arrows.ARROWS.*;

public class DAY22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String tip = "";
        String fletch = "";
        int cm = 0;

        System.out.println("Would you like a pre-made arrow(1) or a modular one(2): ");
        int yesno = input.nextInt();

        if (yesno == 1 ) {
            System.out.println("What type would you like? ");
            System.out.println("EliteArrow(1)");
            System.out.println("BeginnerArrow(2)");
            System.out.println("MarksmanArrow(3)");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    EliteArrow();
                    break;
                case 2:
                    BeginnerArrow();
                    break;
                case 3:
                    MarksmanArrow();
                    break;
            }

        } else {

            System.out.println("What type of arrow head would you like? ");
            System.out.println("1. steel");
            System.out.println("2. wood");
            int head = input.nextInt();

            switch (head) {
                case 1:
                    tip = String.valueOf(arrowhead.Steel);
                case 2:
                    tip = String.valueOf(arrowhead.Wood);
            }

            System.out.println("What type of shaft? ");
            System.out.println("1. goose");
            System.out.println("2. plastic");
            int fletching = input.nextInt();

            switch (fletching) {
                case 1:
                    fletch = String.valueOf(arrows.fletching.Goose);
                case 2:
                    fletch = String.valueOf(arrows.fletching.Plastic);
            }

            System.out.println("How long? ");
            System.out.println("1. 95");
            System.out.println("2. 75");
            System.out.println("3. 65");
            int length = input.nextInt();

            switch (length) {
                case 1:
                    cm = 95;
                case 2:
                    cm = 75;
                case 3:
                    cm = 65;
            }

            System.out.println("your arrow has a " + tip + " head with " + fletch + " fletching and is " + cm + "cm long");
        }


    }
}
