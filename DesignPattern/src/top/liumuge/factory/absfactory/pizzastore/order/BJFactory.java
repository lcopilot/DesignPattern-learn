package top.liumuge.factory.absfactory.pizzastore.order;


import top.liumuge.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import top.liumuge.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import top.liumuge.factory.absfactory.pizzastore.pizza.Pizza;

//* 工厂子类
public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("抽象工厂");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }

}
