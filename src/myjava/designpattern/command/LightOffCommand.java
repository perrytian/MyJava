package myjava.designpattern.command;

public class LightOffCommand implements Command{
	Light light;
	
	public LightOffCommand(Light light){
		this.light = light;
	}
	
	
	public void execute() {
		// TODO Auto-generated method stub
		light.off();
	}


	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.on();
	}
}
