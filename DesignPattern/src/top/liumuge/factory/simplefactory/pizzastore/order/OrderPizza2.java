package top.liumuge.factory.simplefactory.pizzastore.order;

import top.liumuge.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/7
 * @time: 19:54
 * @description:
 */
public class OrderPizza2 {

    String orderType;
    Pizza pizza=null;

    public OrderPizza2(){
        do {
            orderType=gettype();
            pizza=SimpleFactory.createPizza2(orderType);
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
