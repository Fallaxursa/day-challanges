package Fountain_of_items;

public class Room {
    RoomType roomType;
    String visitNotification;

    public RoomType getRoomType() {
        return roomType;
    }

    public Room(RoomType roomType, String visitNotification) {
        this.roomType = roomType;
        this.visitNotification = visitNotification;
    }

    void visit() {
        System.out.println(visitNotification);
    }
}
