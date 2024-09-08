package commandPattern;

public class ViewerApp {
	
	    public static void main(String[] args){
	        Tv tv = new Tv();
	        Electricfan fan = new Electricfan();
	        GarageDoor door = new GarageDoor();
	        
	        RemoteControl rc = new RemoteControl();

	        PowerOn powerOn = new PowerOn(tv);
	        System.out.println(powerOn.execute());

	        PowerOff powerOff = new PowerOff(tv);
	        System.out.println(powerOff.execute());
	        
	        FanOn fanOn = new FanOn(fan);
	        System.out.println(fanOn.execute());
	        
	        FanOff fanOff = new FanOff(fan);
	        System.out.println(fanOff.execute());

	        FanSpeedUp fanSpeedUp = new FanSpeedUp(fan);
	        System.out.println(fanSpeedUp.execute());

	        FanSpeedDown fanSpeedDown = new FanSpeedDown(fan);
	        System.out.println(fanSpeedDown.execute());
	        
	        DoorOpen doorOpen = new DoorOpen(door);
	        System.out.println(doorOpen.execute());
	        
	        DoorClose doorClose = new DoorClose(door);
	        System.out.println(doorClose.execute());
	        
	        DoorLock doorLock = new DoorLock(door);
	        System.out.println(doorLock.execute());

	    
	        
	}
}
