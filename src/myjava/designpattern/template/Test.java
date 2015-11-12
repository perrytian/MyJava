package myjava.designpattern.template;

public class Test {
	public static void main(String[] args) {
		System.out.println("冲泡咖啡**************");
		Coffee coffee = new Coffee();
		coffee.create();// 冲泡咖啡
		System.out.println("冲泡茶**************");
		Tea tea = new Tea();//冲泡茶
		tea.create();
	}
}
