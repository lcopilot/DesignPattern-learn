package top.liumuge.principle.singleResponsibility;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/6/16
 * @time: 20:21
 * @description:
 */
public class SingleResponsibility02 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        AirVehicle airVehicle = new AirVehicle();
        WaterVehicle waterVehicle = new WaterVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");
        airVehicle.run("飞机");
    }
}

/**
 * 方式 2
 * 1.遵守单一职责原则
 * 2.但是这样做改动很大,即将类分解,同时修改客户端
 * 3.改进:直接修改Vehicle 类,改动的代码会比较少=>方式3
 */
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"公路运行");
    }
}
class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在天空运行");
    }
}
class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在水中运行");
    }
}
