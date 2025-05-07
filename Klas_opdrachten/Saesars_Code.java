package Klas_opdrachten;

public class Saesars_Code { //remove the C
    public static void main(String[] args) {
        String code = "ZORO"; //acii a = 065 through z = 090 IWASRONG it was 101 = 132 LMAOOOOOO

        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);

            if (ch > 132) {}
//            if (ch > 065 && ch < 132) { ch += 3; }

//            ch += 3; //char starts at 0 so do number and add 1.

            System.out.print(ch);
        }
    }
}
