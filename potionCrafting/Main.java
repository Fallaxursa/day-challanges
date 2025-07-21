package potionCrafting;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> possibleIngredients = new ArrayList<>();
        Potions currentPotion = Potions.WATER;
        while(true) {
            System.out.println("Your current potion is: " + currentPotion);
            System.out.println("What do you want to add?");



            System.out.print("> ");
            String chosen = scanner.nextLine().trim().toUpperCase();

            if (chosen.equalsIgnoreCase("quit")) {
                break;
            }

            if (chosen.equalsIgnoreCase("restart")) {
                currentPotion = Potions.WATER;
            }

            Ingredients ingredient = Ingredients.NONE;
            try {
                ingredient = Ingredients.valueOf(chosen);
            } catch (IllegalArgumentException e) {
                System.out.println("INVALID INPUT");
            }



            currentPotion = addIngredient(currentPotion, ingredient);


        }
    }

    public static Potions addIngredient(Potions current, Ingredients chosen) {

        if (current.equals(Potions.WATER) && chosen.equals(Ingredients.STARDUST)) {
            System.out.println("You made an ELIXER");
            return Potions.ELIXIR;
        } else if (current.equals(Potions.ELIXIR) && chosen.equals(Ingredients.SNAKE_VENOM)) {
            System.out.println("You made a POISON POTION");
            return Potions.POISON;
        } else if (current.equals(Potions.ELIXIR) && chosen.equals(Ingredients.DRAGON_BREATH)) {
            System.out.println("You made a FLYING POTION");
            return Potions.FLYING;
        } else if (current.equals(Potions.ELIXIR) && chosen.equals(Ingredients.SHADOW_GLASS)) {
            System.out.println("You made a INVISIBILITY POTION");
            return Potions.INVISIBILITY;
        } else if (current.equals(Potions.ELIXIR) && chosen.equals(Ingredients.EYESHINE_GEM)) {
            System.out.println("You made a NIGHT SIGHT POTION");
            return Potions.NIGHT_SIGHT;
        } else if (current.equals(Potions.NIGHT_SIGHT) && chosen.equals(Ingredients.SHADOW_GLASS)) {
            System.out.println("You made a CLOUDY BREW");
            return Potions.CLOUDY_BREW;
        } else if (current.equals(Potions.INVISIBILITY) && chosen.equals(Ingredients.EYESHINE_GEM)) {
            System.out.println("You made a  CLOUDY BREW");
            return Potions.CLOUDY_BREW;
        } else if (current.equals(Potions.CLOUDY_BREW) && chosen.equals(Ingredients.STARDUST)) {
            System.out.println("You made a WRATH POTION");
            return Potions.WRAITH;
        }

        System.out.println("You made a RUINED POTION!");
        return Potions.RUINED;
    }
    
//    public static boolean isAllowed(Potions current) {
//        if (current.equals(Potions.WATER)) {
//
//        }
//    }
}
