package myjava.designpattern.command;

public class RemoteControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		Light light = new Light("123");
		LightOnCommand lightOn = new LightOnCommand(light);
		
		remote.setCommand(lightOn);
		remote.buttonPressed();
	}

}
