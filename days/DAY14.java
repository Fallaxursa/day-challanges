import java.util.Arrays;
import java.util.Scanner;

public class DAY14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] FirstArray = new int[5];

//        System.out.println(FirstArray.length);

        System.out.println("Please enter 5 numbers");
        System.out.print("1. ");
        int numb1 = input.nextInt();
        FirstArray[0] = numb1;
        System.out.print("2. ");
        int numb2 = input.nextInt();
        FirstArray[1] = numb2;
        System.out.print("3. ");
        int numb3 = input.nextInt();
        FirstArray[2] = numb3;
        System.out.print("4. ");
        int numb4 = input.nextInt();
        FirstArray[3] = numb4;
        System.out.print("5. ");
        int numb5 = input.nextInt();
        FirstArray[4] = numb5;

        System.out.println(Arrays.toString(FirstArray));

    }
}
