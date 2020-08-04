package top.liumuge.principle.singleResponsibility;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/6/16
 * @time: 20:13
 * @description:
 */
public class SingleResponsibility01 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

//交通工具类

/**
 * 方式 1
 * 1.在方式 1 的run方法中违反了单一职责原则
 * 2.解决的方案 根据交通工具的运行方法不同 分解成不同的类型
 */
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行...");
    }
}
