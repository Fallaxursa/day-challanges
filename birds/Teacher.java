package birds;

public class Teacher implements Person {
    private int id;
    private int year;

    public Teacher(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void PrintId() {
        System.out.println("Teacher id: " + getId());
    }

    @Override
    public void PrintYear() {
        System.out.println("Teacher year: " + getYear());
    }

}
