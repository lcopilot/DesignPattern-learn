package top.liumuge.adapter.objectadapter;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/13
 * @time: 19:00
 * @description:
 */
public class VoltageAdapter implements IVoltage5V {

	private Voltage220V voltage220V;  // 关联关系的聚合

	public VoltageAdapter(Voltage220V voltage220V) {
		this.voltage220V = voltage220V;
	}

	@Override
	public int output5V() {
		int dstV=0;
		if (voltage220V!=null){
			//获取到220v
			int src = voltage220V.output220V();
			//处理过后的电压
			dstV = src / 44; // 转成5v
		}
		return dstV;
	}
}
