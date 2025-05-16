package Car;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(60, "car");
        Car car = new Car("hehe", "yesnt", 2000, engine);
        System.out.println(engine.toString());
        System.out.println(car.toString());
    }
}
