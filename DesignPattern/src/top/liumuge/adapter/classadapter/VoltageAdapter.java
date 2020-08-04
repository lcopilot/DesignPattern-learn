package top.liumuge.adapter.classadapter;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/13
 * @time: 19:00
 * @description:
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

	@Override
	public int output5V() {
		//获取到220v
		int src = output220V();
		//处理过后的电压
		int dstV=src/44; // 转成5v
		return dstV;
	}
}
