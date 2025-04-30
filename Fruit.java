public class Fruit {
    public boolean readyToEat;
    private int size;
    public String type;

    public Fruit(boolean readyToEat, int size, String type) {
        this.readyToEat = readyToEat;
        this.size = size;
        this.type = type;
    }

    public void checkFruitSize() {
        System.out.println("The fruit size is " + size);
    }
}
