package Car;

public class Engine {
    private int horsePower;
    private String type;

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int hp) {
        this.horsePower = horsePower;
    }

    public int setHorsePower(String hpAsString) {
        try {
            int hp = Integer.parseInt(hpAsString);
            return hp;
        } catch (Exception e) {
            System.out.println("DOESN'T WORK :(");
            return 0;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Engine(int horsePower, String type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    public Engine() {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", type='" + type + '\'' +
                '}';
    }
}
