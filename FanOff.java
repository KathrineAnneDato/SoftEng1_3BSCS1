package commandPattern;

public class FanOff implements Command {
	
		    private Electricfan fan;
		    public FanOff(Electricfan fan){
		        this.fan = fan;
		    }
		    @Override
		    public String execute() {
		        return fan.switchOff();
		    }
	}

