package Course;

import java.util.List;

public class Course {
    Teacher teacher;
    List<Student> student;

    public Course(Teacher teacher, Student... student) {
        this.teacher = teacher;
        this.student = List.of(student);
    }

    public void printDetails() {
        this.teacher.printTc();
        for (Student student : student) {
            student.printSt();
        }
    }
}
