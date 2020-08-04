package top.liumuge.adapter.objectadapter;


/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/13
 * @time: 19:07
 * @description:
 */
public class client {

	public static void main(String[] args) {
		//* 类适配器
		System.out.println("===对象适配器===");
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter(new Voltage220V()));
	}
}
