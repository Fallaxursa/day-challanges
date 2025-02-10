package cards;



public class DAY25 {
    public static void main (String[] args) {
//
        for (color Color : color.values()) {

            for (rank Rank : rank.values()) {
                System.out.println("The " + Color + " " + Rank);
            }

        }

        }
    }

//The reason why we use a color enumeration instead of a class is
//because we want to select it and doesn't require user input.