package top.liumuge.builder.improve;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/10
 * @time: 21:21
 * @description:
 */
public class HighHouseBuilder extends HouseBuilder {

	@Override
	public void buildBasic() {
		System.out.println("高楼 打地基");
	}

	@Override
	public void buildWalls() {
		System.out.println("高楼 砌墙");
	}

	@Override
	public void roofed() {
		System.out.println("高楼 封顶");
	}
}
