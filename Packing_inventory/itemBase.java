package Packing_inventory;

public class itemBase {
    protected double weight;
    protected double volume;

    public itemBase(double weight, double volume) {
        this.weight = weight;
        this.volume = volume;
    }

    public double getWeight() { return weight; }
    public double getVolume() { return volume; }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}