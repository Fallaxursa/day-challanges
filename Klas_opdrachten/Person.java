package Klas_opdrachten;

public class Person {
    String name;
    int age;

    Person(String name, int age) { //these are parameters
        this.name = name;
        this.age = age;
    }

    public void printDetails() {
        System.out.print(STR."\{this.name} name and \{this.age}");
    }

}
