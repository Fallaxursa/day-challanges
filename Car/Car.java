package Car;

public class Car {
    private String make;
    private String model;
    private int year;
    private Engine engine;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        if (engine.getHorsePower() > 50) {
            System.out.println("the engine has too many horses!!!");
        }
        this.engine = engine;
    }

    public Car(String make, String model, int year, Engine engine) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }

    public Car() {

    }
}
