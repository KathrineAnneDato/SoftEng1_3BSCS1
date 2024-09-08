package commandPattern;

public class FanSpeedDown implements Command {
		 
	    private Electricfan fan;

	    public FanSpeedDown(Electricfan fan) {
	        this.fan = fan;
	    }

	    @Override
	    public String execute() {
	        String result = fan.SpeedDown();
			return result;
	    }
}
