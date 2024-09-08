package commandPattern;

public class DoorLock implements Command {

	private GarageDoor door;
    public DoorLock(GarageDoor door){
        this.door = door;
    }
    @Override
    public String execute() {
        return door.Lock();
    }
}
