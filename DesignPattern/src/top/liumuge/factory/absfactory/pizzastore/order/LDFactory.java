package top.liumuge.factory.absfactory.pizzastore.order;


import top.liumuge.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import top.liumuge.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import top.liumuge.factory.absfactory.pizzastore.pizza.Pizza;

//* 工厂子类
public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("抽象工厂");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }

}
