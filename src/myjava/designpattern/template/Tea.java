package myjava.designpattern.template;

public class Tea extends Beverage {

	@Override
	public void addCoundiments() {
		// TODO Auto-generated method stub
		System.out.println("添加蜂蜜");  
	}

	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("用水冲茶");  
	}

}
