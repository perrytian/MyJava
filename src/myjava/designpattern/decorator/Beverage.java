package myjava.designpattern.decorator;

public abstract class Beverage {

	String description = "Unkonwn Beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
