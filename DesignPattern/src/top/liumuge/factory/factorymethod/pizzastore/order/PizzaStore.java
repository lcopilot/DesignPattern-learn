package top.liumuge.factory.factorymethod.pizzastore.order;

public class PizzaStore {

	public static void main(String[] args) {
		String loc = "bj";
		if (loc.equals("bj")) {
			new BJOrderPizza();
		} else {
			new LDOrderPizza();
		}

	}

}
