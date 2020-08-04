package top.liumuge.factory.factorymethod.pizzastore.pizza;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/7
 * @time: 20:26
 * @description:
 */
public class LDChessPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦 cheese");
        System.out.println("伦敦 Cheese");
    }
}
