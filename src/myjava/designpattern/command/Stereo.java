package myjava.designpattern.command;

/**
 * 音响类
 * @author tianpengyu
 *
 */
public class Stereo {

	private String name;
	public Stereo(String name) {
		this.name = name;
	}
	public void on(){
		System.out.println("Stereo is on "+name);
	}
	
	public void off(){
		System.out.println("Stereo is off "+name);
	}
	
	public void setCd(){
		System.out.println("Stereo is setCd "+name);
	}
	
	public void setDvd(){
		System.out.println("Stereo is setDvd "+name);
	}
	
	public void setRadio(){
		System.out.println("Stereo is setRadio "+name);
	}
	
	public void setVolume(int n){
		System.out.println("Stereo is setVolume,n["+n+"]"+name);
	}
	
}
