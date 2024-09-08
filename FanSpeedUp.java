package commandPattern;

public class FanSpeedUp implements Command {
	 
	    private Electricfan fan;

	    public FanSpeedUp(Electricfan fan) {
	        this.fan = fan;
	    }

	    @Override
	    public String execute() {
	        String result = fan.SpeedUp();
			return result;
	    }
	}


