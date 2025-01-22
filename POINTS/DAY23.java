package POINTS;

public class DAY23 {
   public static void main(String[] args) {

      points origin = new points(0, 0);
      points point1 = new points(2, 0);
      points point2 = new points(-4, 0);


      System.out.println(point1);
      System.out.println(origin);
      System.out.println(point2);

//    The X and Y are immutable because the POINTS.points are final.
//    made it immutable to avoid accidentally changing the POINTS.points.
   }
}
