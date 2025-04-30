package Simulas_soup;
import Utilities.User_input;

public class simulas_soup {
    public static void main (String[] args) {
        boolean food_switch = true;
        boolean ingredient_switch = true;
        boolean seasoning_switch = true;

        Soup.Food_type food_out = null;
        Soup.Main_ingredient ingredient_out = null;
        Soup.Seasoning seasoning_out = null;


        while (food_switch) {
            System.out.println("What food type do you want: ");
            for (Soup.Food_type option : Soup.Food_type.values()) {
                System.out.println(option);
            }
            String food = User_input.AskForString("what would you like? ".toLowerCase());

            System.out.println(food);

            switch (food) {
                case "soup":
                    System.out.println("you chose soup");
                    food_out = Soup.Food_type.Soup;
                    food_switch = false;
                    break;
                case "stew":
                    System.out.println("you chose stew");
                    food_out = Soup.Food_type.Stew;
                    food_switch = false;
                    break;
                case "gumbo":
                    System.out.println("you chose gumbo");
                    food_out = Soup.Food_type.Gumbo;
                    food_switch = false;
                    break;
                default:
                    System.out.println("thats invalid!");
            }
        }
        while (ingredient_switch) {
            System.out.println("What main ingredient do you want: ");
            for (Soup.Main_ingredient option : Soup.Main_ingredient.values()) {
                System.out.println(option);
            }
            String ingredient = User_input.AskForString("what ingredient would you like? ".toLowerCase());
            System.out.println(ingredient);

            switch (ingredient) {
                case "mushrooms":
                    System.out.println("you chose mushrooms");
                    ingredient_out = Soup.Main_ingredient.Mushrooms;
                    ingredient_switch = false;
                    break;
                case "chickens":
                    System.out.println("you chose chickens");
                    ingredient_out = Soup.Main_ingredient.Chickens;
                    ingredient_switch = false;
                    break;
                case "carrots":
                    System.out.println("you chose carrots");
                    ingredient_out = Soup.Main_ingredient.Carrots;
                    ingredient_switch = false;
                    break;
                case "potatoes":
                    System.out.println("you chose potatoes");
                    ingredient_out = Soup.Main_ingredient.Potatoes;
                    ingredient_switch = false;
                    break;
                default:
                    System.out.println("thats invalid");
            }
        }
        while (seasoning_switch) {
            System.out.println("What main ingredient do you want: ");
            for (Soup.Seasoning option : Soup.Seasoning.values()) {
                System.out.println(option);
            }
            String seasoning = User_input.AskForString("what ingredient would you like? ".toLowerCase());
            System.out.println(seasoning);

            switch (seasoning) {
                case "spicy":
                    System.out.println("you chose spicy");
                    seasoning_out = Soup.Seasoning.Spicy;
                    seasoning_switch = false;
                    break;
                case "salty":
                    System.out.println("you chose salty");
                    seasoning_out = Soup.Seasoning.Salty;
                    seasoning_switch = false;
                    break;
                case "sweet":
                    System.out.println("you chose sweet");
                    seasoning_out = Soup.Seasoning.Sweet;
                    seasoning_switch = false;
                    break;
                default:
                    System.out.println("thats invalid!");
            }
        }

        System.out.println("you got a " + food_out + " with " + ingredient_out + " and " + seasoning_out + " seasoning");





//            food_switch = false;





    }
}
