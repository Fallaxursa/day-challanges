package Modular_object_test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CraftingSystem {
    Map<List<String>, WeaponBlueprint> recipeMap = new HashMap<>();

    CraftingSystem() {
        recipeMap.put(Arrays.asList("roll", "jump", "attack"), new WeaponBlueprint("Assault riffle", 3, 30, 1.5));
        recipeMap.put(Arrays.asList("dash", "attack", "jump"), new WeaponBlueprint("Shotgun", 2, 25, 1.2));
    }

    Weapon craftWeapon(List<String> chain, Player player) {
        WeaponBlueprint blueprint = recipeMap.get(chain);
        if (blueprint != null) {
            if (player.getScrap() >= blueprint.getCost()) {
                player.subScrap(blueprint.getCost());
                return blueprint.createWeapon();
            }
        } else {
            return new Weapon("Broken Weapon", 1, 0, 2.0);
        }
        return null;
    }
}
