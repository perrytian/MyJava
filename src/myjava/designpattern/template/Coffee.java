package myjava.designpattern.template;

public class Coffee extends Beverage {

	@Override
	public void addCoundiments() {
		// TODO Auto-generated method stub
		System.out.println("添加糖和牛奶");
	}

	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("用水冲咖啡");
	}
	
	 /** 
     * 有的客人不喜欢加配料 
     */  
    @Override  
    public boolean hook() {  
        return false;  
    }  
    

	 /** 
     * 挂钩 
     */  
/*    @Override  
    public void hook() {  
        System.out.println("再来一杯");  
    } */ 
}
