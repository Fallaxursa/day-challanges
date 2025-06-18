package Klas_opdrachten;

public class DoWhile {
    public static void main(String[] args) {
        int [] list = new int [5];
        int i = 0;
        int j = 0;

        do {
            list [i] = i + 2;
            System.out.println(list [i]);
            i++;
        }
        while (i < 5);

        System.out.println("");

        while (j < 5) {
            list [j] = j + 2;
            System.out.println(list [j]);
            j++;
        }
    }


}
