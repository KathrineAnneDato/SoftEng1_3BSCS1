package commandPattern;

public class DoorOpen implements Command {

	private GarageDoor door;
    public DoorOpen(GarageDoor door){
        this.door = door;
    }
    @Override
    public String execute() {
        return door.Open();
    }
}
