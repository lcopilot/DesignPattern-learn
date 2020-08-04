package top.liumuge.factory.factorymethod.pizzastore.pizza;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/7
 * @time: 20:25
 * @description:
 */
public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京 greek");
        System.out.println("北京 greek");
    }
}
