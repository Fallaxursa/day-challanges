package Modular_object_test;

public class WeaponBlueprint {
    private String name;
    private int ammo;
    private int cost;
    private double scrapMultiplier;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmmo() {
        return ammo;
    }

    public int getCost() {
        return cost;
    }

    public double getScrapMultiplier() {
        return scrapMultiplier;
    }


    public WeaponBlueprint(String name, int ammo, int cost, double scrapMultiplier) {
        this.name = name;
        this.ammo = ammo;
        this.cost = cost;
        this.scrapMultiplier = scrapMultiplier;
    }

    Weapon createWeapon() {
        return new Weapon(getName(), getAmmo(), getCost(), getScrapMultiplier());
    }
}
