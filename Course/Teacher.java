package Course;

public class Teacher {
    private String name;
    private String mail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {

        // Alleen geldig wanneer er een @ in de string staat
        this.mail = mail;
    }

    public Teacher(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    public void printTc() {
        System.out.println(STR."Teacher - name \{getName()}, mail \{getMail()}.");
    }
}
