package Course;

public class Teacher {
    String name;
    String mail;

    public Teacher(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    public void printTc() {
        System.out.println(STR."Teacher - name \{this.name}, mail \{this.mail}.");
    }
}
