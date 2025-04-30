public class DAY15 {
    public static void main(String[] args) {
        int[] array = { 4, 51, -7, 13, -99, 15, -8, 45, 90 };
        int currentSmallest = Integer.MAX_VALUE; // Start higher than anything in the array.
        int currentBiggest = Integer.MIN_VALUE;
        int total = 0;

        for (int E : array) {
            if (E > currentBiggest) {
                currentBiggest = E;
            }

            if (E < currentSmallest) {
                currentSmallest = E;
            }

            total += E;
        }
        System.out.println(currentBiggest);


//        for (int E : array) {
//            if (E < currentSmallest) {
//                currentSmallest = E;
//            }
//        }
//
        System.out.println(currentSmallest);
//
////        int total = 0;
//        for (int E : array)
//            total += E;
        double average = (double)total / array.length;
//
        System.out.println(average);
    }
}
