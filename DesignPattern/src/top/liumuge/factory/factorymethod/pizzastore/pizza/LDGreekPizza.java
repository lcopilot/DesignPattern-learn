package top.liumuge.factory.factorymethod.pizzastore.pizza;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/7
 * @time: 20:27
 * @description:
 */
public class LDGreekPizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦 greek");
        System.out.println("伦敦 greek");
    }
}
