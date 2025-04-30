import java.util.Arrays;
import java.util.Scanner;
import Utilities.Colors;

public class DAY14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[5]; //array:)
        int[] userArray = new int[5];

        System.out.println(Colors.color(Arrays.toString(array), Colors.RED));//tmp

        for (int i = 0; i < array.length; i++) {
            System.out.println("what would you input? ");
            int value = input.nextInt();

            array[i] = value;

        }
        System.out.println(Colors.color(Arrays.toString(array), Colors.RED));

        System.out.println(Colors.color(Arrays.toString(userArray), Colors.BLUE));

        for (int i = 0; i < array.length; i++) {
            userArray[i] = array[i];
        }

        System.out.println(Colors.color(Arrays.toString(userArray), Colors.YELLOW));

    }
}
