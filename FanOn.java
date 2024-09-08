package commandPattern;

public class FanOn implements Command {
	 

	    private Electricfan fan;
	    public FanOn(Electricfan fan){
	        this.fan = fan;
	    }
	    @Override
	    public String execute() {
	        return fan.switchOn();
	    }
}
