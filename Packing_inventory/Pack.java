package Packing_inventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pack {
    private final int maxQuantity;
    private final double maxWeight;
    private final double maxVolume;

    private final ArrayList<itemBase> items;

    public Pack(int maxQuantity, double maxWeight, double maxVolume) {
        this.items = new ArrayList<>();
        this.maxQuantity = maxQuantity;
        this.maxWeight = maxWeight;
        this.maxVolume = maxVolume;
    }

    public boolean add(itemBase item) {
        if (items.size() >= maxQuantity || getTotalWeight() + item.getWeight() > maxWeight || getTotalVolume() + item.volume > maxVolume) {
            System.out.println("cant add");
            return false;
        }

        items.add(item);
        System.out.println("item added");
        return true;
    }

    public void printCount() {
        Map<String, Integer> counts = new HashMap<>();
        for (itemBase item : items) {
            String itemName = item.toString();
            int currentCount = counts.getOrDefault(itemName, 0);
            counts.put(itemName, currentCount + 1);
        }

        System.out.println("Item count:");
        counts.forEach((name, count) -> System.out.println("- " + name + ": " + count));
    }

    public void stats() {
        System.out.println("count: " + items.size() + "/" + maxQuantity);
        System.out.println("weight: " + getTotalWeight() + "/" + maxWeight);
        System.out.println("volume: " + getTotalVolume() + "/" + maxVolume);
    }

    public double getTotalWeight() {
        double total = 0;
        for (itemBase item : items) {
            total += item.getWeight();
        }
        return total;
    }

    public double getTotalVolume() {
        double total = 0;
        for (itemBase item : items) {
            total += item.getVolume();
        }
        return total;
    }
}
