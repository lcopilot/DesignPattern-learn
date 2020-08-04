package top.liumuge.factory.simplefactory.pizzastore.order;

import top.liumuge.factory.simplefactory.pizzastore.pizza.CheesePizza;
import top.liumuge.factory.simplefactory.pizzastore.pizza.GreekPizza;
import top.liumuge.factory.simplefactory.pizzastore.pizza.PepperPizza;
import top.liumuge.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/7
 * @time: 17:31
 * @description:
 */
public class OrderPizza {
   /* public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType =gettype();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("greek");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("cheese");
            }else if (orderType.equals("pepper")){
                pizza=new PepperPizza();
                pizza.setName("胡椒");
            }else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.bake();
        } while (true);
    }*/

   //定义简单工厂
    SimpleFactory simpleFactory;
    Pizza pizza=null;

    public OrderPizza(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType="";//用户输入
        this.simpleFactory=simpleFactory; //设置简单工厂对象
        do {
            orderType=gettype();
            pizza=this.simpleFactory.createPizza(orderType);
            if (pizza==null) break;
        }while (true);
    }

    //获取用户需要订购的披萨种类
    private String gettype() {
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