package myjava.designpattern.command;

public class RemoteLoader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RemoteControl remoteControl = new RemoteControl();
		
		//undo
		RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		Stereo stereo = new Stereo("Stereo");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOffCDCommand = new StereoOffCommand(stereo);
		
/*		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, stereoOnWithCDCommand, stereoOffCDCommand);
		
		System.out.println(remoteControl.toString());
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);*/
		
		//undo
		remoteControlWithUndo.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		
		remoteControlWithUndo.onButtonWasPushed(0);
		remoteControlWithUndo.undoButtonWasPushed();
	}

}
