package top.liumuge.factory.factorymethod.pizzastore.pizza;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/7
 * @time: 20:23
 * @description:
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京 cheese");
        System.out.println("北京 Cheese");
    }
}
