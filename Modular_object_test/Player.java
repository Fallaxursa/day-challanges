package Modular_object_test;

public class Player {
    private int scrap = 50;
    private Weapon currentWeapon;
    long lastCraftTime;
    boolean firedSinceCraft = false;

    public int getScrap() {
        return scrap;
    }

    public void addScrap(int scrap) {
        this.scrap += scrap;
    }

    public void subScrap(int amount) {
        this.scrap -= amount;
    }

    void equipWeapon(Weapon w) {
        this.currentWeapon = w;
        this.lastCraftTime = System.currentTimeMillis();
        this.firedSinceCraft = false;
    }

    void fireWeapon() {
        if (currentWeapon != null) {
            currentWeapon.fire();
            firedSinceCraft = true;
            if (currentWeapon.getAmmo() <= 0) currentWeapon = null;
        }
    }

    void eatWeapon() {
        long now = System.currentTimeMillis();
        if (currentWeapon != null && (now - lastCraftTime < 30000) && !firedSinceCraft) {
            addScrap(currentWeapon.getCost());
            System.out.println("Weapon eaten. Scrap refunded: " + currentWeapon.getCost());
            currentWeapon = null;
        } else {
            System.out.println("Cannot eat weapon! (too late or already fired).");
        }
    }
}
