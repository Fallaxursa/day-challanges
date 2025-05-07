package Klas_opdrachten;

public class Temperatuur {
    public static void main(String[] args) {

        float farenheit = 35f;
        float celsius = 2f;
        float outFarenheit;
        float outCelsius;

        outFarenheit = (celsius * 9/5) + 32;
        outCelsius = (farenheit - 32) * 5/9;

        System.out.println(STR."\{celsius} is equal to \{outFarenheit} farenheit");
        System.out.println(STR."\{farenheit} is equal to \{outCelsius} celsius");
    }
}
