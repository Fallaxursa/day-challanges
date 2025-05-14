package Klas_opdrachten;

public class Dog {
    String breed;
    static int amountOfDogs = 0; // if changing this in an object it changes every instance of this as its class based instead of instance based
    // always get the class instead of the variable when summoning variable and changing.


    void bark(boolean isScared) {
        if (isScared) {
            System.out.println("BARK");
        } else {
            System.out.println("bark");
        }
    }

    void Dog(String breed) {
        this.breed = breed;
        amountOfDogs++;
    }

    void eat() {
        int amount = 0;
        for (int i = 0; i < 10; i++) {
            int age = 10;
            System.out.println(amount);
            amount++;
        }
    }
}
