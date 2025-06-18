package Modular_object_test;

public class Weapon {
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

    public Weapon(String name, int ammo, int cost, double scrapMultiplier) {
        this.name = name;
        this.ammo = ammo;
        this.cost = cost;
        this.scrapMultiplier = scrapMultiplier;
    }

    void fire() {
        if (getAmmo() > 0) {
            ammo--;
            System.out.println("Fired! Ammo left: " + getAmmo());
        } else {
            System.out.println(getName() + " is out of ammo!");
        }
    }
}
