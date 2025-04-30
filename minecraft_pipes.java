import java.util.HashMap;
import java.util.Map;

public class minecraft_pipes {

    private Map<String, Integer> chest = new HashMap<>();

    public minecraft_pipes(int copperIngots, int stoneButtons) {
        chest.put("copper_ingot", copperIngots);
        chest.put("stone_button", stoneButtons);
        chest.put("birtch_planks", 0);
    }

    private boolean canCraft() {
        return chest.getOrDefault("copper_ingot", 0) >= 1 && chest.getOrDefault("stone_button", 0) >= 2;
    }

    public void craft() {
        while(canCraft()) {
            chest.put("copper_ingot", chest.get("copper_ingot") -1);
            chest.put("stone_button", chest.get("stone_button") -2);
            chest.put("birtch_planks", chest.get("birtch_planks") +1);

            System.out.println("you crafted 1 birch plank!");
        }
        System.out.println("not enough items to craft");
    }

    public void displayChest() {
        System.out.println("Chest Contents:");
        for (Map.Entry<String, Integer> entry : chest.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        minecraft_pipes crafter = new minecraft_pipes(10, 19);

        crafter.displayChest();

        crafter.craft();

        crafter.displayChest();
    }
}
