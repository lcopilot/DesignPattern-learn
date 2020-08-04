package top.liumuge.factory.absfactory.pizzastore.order;


import top.liumuge.factory.absfactory.pizzastore.pizza.Pizza;

public interface AbsFactory {

	public Pizza createPizza(String orderType);
}
