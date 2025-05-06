package Getters_Setters;

public class Main_Getters_setters {
    public static void main(String[] args) {
        Getters_setters getters = new Getters_setters(); // always initialize the classes
        getters.setNum(5); // always say the class name first then . then setter/getter

        System.out.println("the num = " + getters.getNum());
        System.out.println("bool = " + getters.isTrue());

    }
}
