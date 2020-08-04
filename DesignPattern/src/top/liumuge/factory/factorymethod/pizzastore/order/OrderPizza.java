package top.liumuge.factory.factorymethod.pizzastore.order;

import top.liumuge.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public abstract class OrderPizza {

	abstract Pizza createPizza(String orderType);

	public OrderPizza() {
		Pizza pizza = null;
		String orderType;
		do {
			orderType = getType();
			pizza = createPizza(orderType);
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
			
		} while (true);
	}

	


	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza type:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
