package top.liumuge.adapter.classadapter;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/13
 * @time: 19:04
 * @description:
 */
public class Phone {

	//充电
	public void charging(IVoltage5V iVoltage5V){
		if (iVoltage5V.output5V()==5){
			System.out.println("5V");
		}else {
			System.out.println("电压过高");
		}
	}

}
