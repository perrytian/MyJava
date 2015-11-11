package myjava.designpattern.factory;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore=new NYPizzaStore();
		PizzaStore chicago = new ChicagoStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan order a "+pizza.getName()+"\n");
		
		pizza = chicago.orderPizza("cheese");
		System.out.println("Joe order a "+pizza.getName()+"\n");
	}

}
