package Room_Coordinates;

public class Room_Coordinates_day36 {
    public static void main(String[] args) {

        Coordinate_maker cord1 = new Coordinate_maker(1, 2);
        Coordinate_maker cord2 = new Coordinate_maker(1, 3);
        Coordinate_maker cord3 = new Coordinate_maker(2, 5);
        Coordinate_maker cord4 = new Coordinate_maker(3, 5);

        Coordinate_maker.printResult(cord1.isAdjacent(cord2));
        Coordinate_maker.printResult(cord2.isAdjacent(cord3));
        Coordinate_maker.printResult(cord4.isAdjacent(cord2));
        Coordinate_maker.printResult(cord4.isAdjacent(cord3));
    }
}
