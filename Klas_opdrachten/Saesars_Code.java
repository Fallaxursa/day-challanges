package Klas_opdrachten;

public class Saesars_Code { //remove the C
    public static void main(String[] args) {
        String code = "XYZORO"; //acii a = 65 through z = 90
        int saecarShift = 3;
        int reset = 26;

        for (int i = 0; i < code.length(); i++) {
            char acii = code.charAt(i);
            acii -= 'A';
            acii += saecarShift;
            acii %= reset;
            acii += 'A';
            System.out.print(acii);

//            if (acii > 90) {
//                acii -= 26;
//            }

//            if (acii == 91) {
//                acii = 65;
//            }
//            else if (acii == 92) {
//                acii = 66;
//            }
//            else if (acii == 93) {
//                acii = 67;
//            }
//            System.out.print(acii);
        }
    }
}
