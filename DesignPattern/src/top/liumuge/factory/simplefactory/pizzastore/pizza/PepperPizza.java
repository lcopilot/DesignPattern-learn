package top.liumuge.factory.simplefactory.pizzastore.pizza;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/7
 * @time: 19:09
 * @description:
 */
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("胡椒披萨");
    }
}
