package potionCrafting;

import java.util.Scanner;

public class Crafter {


    public void start() {
        Scanner scanner = new Scanner(System.in);
//        Potions currentPotion = Potions.EMPTY;

        while (true) {
//            System.out.println("Current potion: " + currentPotion);

            for (Ingredients ingredients : Ingredients.values()) {
                System.out.println(ingredients);
            }
            System.out.print("Select ingredient: ");
            String newIngredient = scanner.nextLine().toUpperCase().trim();



            }
        }
    }



//    public boolean changeState(Potions previous, Potions next) {
//        return previous.


