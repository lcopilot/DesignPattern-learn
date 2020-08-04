package top.liumuge.factory.factorymethod.pizzastore.order;


import top.liumuge.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import top.liumuge.factory.factorymethod.pizzastore.pizza.BJGreekPizza;
import top.liumuge.factory.factorymethod.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {

	
	@Override
	Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("greek")) {
			pizza = new BJGreekPizza();
		}
		return pizza;
	}

}
