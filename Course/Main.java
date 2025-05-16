package Course;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("joe", "68493045");
        Student s1 = new Student("sam", "12351");
        Student s2 = new Student("kaas", "315");
        Student s3 = new Student("ham", "2389");

        t1.setMail("appel");
        Calculator c1 = new Calculator();

        int result = c1.add(10,1);

        System.out.println(result);

        Course course = new Course(t1, s1, s2, s3);

        course.printDetails();
    }
}
