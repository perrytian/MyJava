package myjava.designpattern.factory;

public class ChicagoStore extends PizzaStore{

	@Override
	Pizza createPizza(String item) {
		// TODO Auto-generated method stub
		if (item.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		}else {
			return null;
		}
	}

}
