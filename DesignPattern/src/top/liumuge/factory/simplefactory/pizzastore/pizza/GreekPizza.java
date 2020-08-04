package top.liumuge.factory.simplefactory.pizzastore.pizza;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/7
 * @time: 17:29
 * @description:
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("希腊披萨 准备原材料");
    }
}
