package birds;

public class Student implements Person {
    private int id;
    private int year;

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public void SetYear(int year) {
        this.year = year;
    }

    @Override
    public void PrintYear() {
        System.out.println("Student year: " + getYear());
    }

    @Override
    public void PrintId() {
        System.out.println("Student id: " + getId());
    }
}
