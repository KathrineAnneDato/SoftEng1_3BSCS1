package commandPattern;

public class DoorClose implements Command {

	private GarageDoor door;
    public DoorClose(GarageDoor door){
        this.door = door;
    }
    @Override
    public String execute() {
        return door.Close();
    }
}