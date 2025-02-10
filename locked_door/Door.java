package locked_door;

public class Door {

    String State = "";
    int Code ;

    public Door(int Code) {
        this.Code = Code;
    }

    public void Change_code() {

    }

    public void State_open() {
        String state = "open";
    }

    public void State_closed() {
        String State = "closed";
    }

    public void State_locked() {
        String State = "locked";
    }

    public void State_unlocked() {
        String State = "unlocked";
    }

}


