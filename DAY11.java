import java.util.Scanner;
public class DAY11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");

        String b = input.nextLine();

        System.out.println("what would you like to buy?:");
        System.out.println("");
        System.out.println("1 rope");
        System.out.println("2 torches");
        System.out.println("3 climbing equipment");
        System.out.println("4 clean water");
        System.out.println("5 machete");
        System.out.println("6 canoe");
        System.out.println("7 food supplies");
        System.out.println("");

        int item = input.nextInt();
        String a = "boo"; //make this a comparison. if compare yes make price half otherwise keep full price.
        if (a.equals(b)) {
            System.out.println("thanks for the help btw, heres a discount.");
            switch (item) {
                case 1:
                    System.out.println("rope costs 5 gold");
                    break;
                case 2:
                    System.out.println("torches costs 7,5 gold");
                    break;
                case 3:
                    System.out.println("climbing equipment costs 12.5 gold");
                    break;
                case 4:
                    System.out.println("clean water costs 0,5 gold");
                    break;
                case 5:
                    System.out.println("machete costs 10 gold");
                    break;
                case 6:
                    System.out.println("canoe costs 100 gold");
                    break;
                case 7:
                    System.out.println("food supplies costs 0,5 gold");
                    break;
            }
        } else {
            switch (item) {
                case 1:
                    System.out.println("rope costs 10 gold");
                    break;
                case 2:
                    System.out.println("torches costs 15 gold");
                    break;
                case 3:
                    System.out.println("climbing equipment costs 25 gold");
                    break;
                case 4:
                    System.out.println("clean water costs 1 gold");
                    break;
                case 5:
                    System.out.println("machete costs 20 gold");
                    break;
                case 6:
                    System.out.println("canoe costs 200 gold");
                    break;
                case 7:
                    System.out.println("food supplies costs 1 gold");
                    break;
            }
        }
    }
}