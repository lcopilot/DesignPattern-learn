package top.liumuge.factory.simplefactory.pizzastore.pizza;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/7
 * @time: 17:27
 * @description:
 */
public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("制作奶酪披萨 准备材料");
    }
}
