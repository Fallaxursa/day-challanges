package birds;


public class Main {
    public static void main(String[] args) {

        Person teacher = new Teacher(111);
        Person student1 = new Student(123);
        Student student2 = new Student(666);

        teacher.PrintId();
        teacher.PrintYear();
        student1.PrintId();
        student2.PrintId();
        student2.SetYear(2);
        student2.PrintYear();
    }
}
