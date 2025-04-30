package Simulas_soup;

public class Soup {
    public enum Food_type{
        Soup,
        Stew,
        Gumbo
    }
    public enum Main_ingredient {
        Mushrooms,
        Chickens,
        Carrots,
        Potatoes
    }
    public enum Seasoning {
        Spicy,
        Salty,
        Sweet
    }

    private Food_type food;
    private Main_ingredient ingredient;
    private Seasoning seasoning;

    public Soup(Food_type food, Main_ingredient ingredient, Seasoning seasoning) {
        this.food = food;
        this.ingredient = ingredient;
        this.seasoning = seasoning;
    }

    @Override
    public String toString() {
        return seasoning + " " + ingredient + " " + food;
    }

}
