package Klas_opdrachten;

public class Keywords {
    //psvm main also works
    public static void main(String[] args) {
        boolean lichtIsAan = true;

//        if (lichtIsAan == true) { // (lichtIsAan) means is true
//            System.out.println("het licht is aan!!!");
//        } else {
//            System.out.println("het licht is uit!!!");
//        }
//
//        if (!lichtIsAan) {// ! reverses the bool.
//            System.out.println("het licht is uit!!");
//        } else {
//            System.out.println("het licht is aaaaaaaaaaaaaaan!!!");
//        }

        int age = 18;
        boolean hasRijBewijs = false;

//        if (hasRijBewijs) {
//            if (age >= 18) {
//                System.out.println("your allowed to DRIVE");
//            } else {
//                System.out.println("je mag rijden onder begeleiding :)");
//            }
//        } else {
//            System.out.println("ur got no rijbewijs");
//        }

//        if (!hasRijBewijs) {
//            System.out.println("you cant drive");
//        } else if (age < 18) {
//            System.out.println("begelijd rijden");
//        } else {
//            System.out.println("you can drive");
//        }


//        int leeftijd = 65;
//
//        if (leeftijd < 18) {
//            System.out.println("Get outta here CHILD);
//        } else if (leeftijd < 65) {
//            System.out.println("GET in");
//        } else {
//            System.out.println("GET OUTTA HERE BOOMER!!!");
//        }


        for (int i = 1; i <= 7; i++) {
            System.out.print(i + " ");
            System.out.print(i + 1 + " ");
            System.out.print(i + 2 + " ");

            System.out.println();
        }

        for (int i = 8; i >= 0; i--) {
            System.out.print("(" + i + "," + 1 + ")");
            System.out.print("(" + i + "," + 2 + ")");
            System.out.print("(" + i + "," + 3 + ")");
            System.out.print("(" + i + "," + 4 + ")");
            System.out.print("(" + i + "," + 5 + ")");
            System.out.print("(" + i + "," + 6 + ")");
            System.out.print("(" + i + "," + 7 + ")");
            System.out.print("(" + i + "," + 8 + ")");

            System.out.println();
        }

        System.out.println();

        int num = 8;

        for (int i = num; i > 0; i--) {
            for (int j = 1; j <= num; j++) {
//                System.out.print("(" + i + "," + j + ")");
                System.out.print(STR."(\{i},\{j})"); //why does this work????
            }
            System.out.println();
        }
    }
    //String \n new line.
    // i in for loop short for index
    //for loops in i > j > k.
    //if > else if > else. can only take the first possible if.
    //always use camel case(every new word after first word is hoofdletter) for variables(var) kaasIsKaas
    //else will always take the nearest if.
    // i guess { } is called an accodlade??.
    //%d decimal %s string
    //System.out.printf(%d, %d) var, var

}
