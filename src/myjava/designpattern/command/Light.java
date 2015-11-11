package myjava.designpattern.command;

/**
 * 电灯类，打开和关闭
 * @author tianpengyu
 *
 */
public class Light {
	
	public String name;
	public Light(String name) {
		this.name = name;
	}

	public void on(){
		System.out.println("Light is on " + name);
	}
	
	public void off(){
		System.out.println("Light is off " + name);
	}
}
