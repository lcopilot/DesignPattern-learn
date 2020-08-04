package top.liumuge.factory.simplefactory.pizzastore.order;

import top.liumuge.factory.simplefactory.pizzastore.pizza.CheesePizza;
import top.liumuge.factory.simplefactory.pizzastore.pizza.GreekPizza;
import top.liumuge.factory.simplefactory.pizzastore.pizza.PepperPizza;
import top.liumuge.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/7
 * @time: 19:24
 * @description:
 */
//简单工厂
public class SimpleFactory {


    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("简单工厂");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("greek");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        }else if (orderType.equals("pepper")){
            pizza=new PepperPizza();
            pizza.setName("胡椒");
        }
        return pizza;
    }
    //简单工厂,也叫静态工厂
    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;
        System.out.println("简单工厂2");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("greek");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        }else if (orderType.equals("pepper")){
            pizza=new PepperPizza();
            pizza.setName("胡椒");
        }
        return pizza;
    }

}
