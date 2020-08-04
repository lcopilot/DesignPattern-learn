package top.liumuge.factory.factorymethod.pizzastore.order;

import top.liumuge.factory.factorymethod.pizzastore.pizza.LDChessPizza;
import top.liumuge.factory.factorymethod.pizzastore.pizza.LDGreekPizza;
import top.liumuge.factory.factorymethod.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

	
	@Override
	Pizza createPizza(String orderType) {
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDChessPizza();
		} else if (orderType.equals("greek")) {
			pizza = new LDGreekPizza();
		}
		return pizza;
	}

}
