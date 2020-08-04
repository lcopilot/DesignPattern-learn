package top.liumuge.factory.simplefactory.pizzastore.order;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/7
 * @time: 18:47
 * @description:
 */
//* 相当于一个客户端
public class PizzaStore {
    public static void main(String[] args) {
        // new OrderPizza();

        //使用简单工厂
        // new OrderPizza(new SimpleFactory());

        new OrderPizza2();
    }


}
