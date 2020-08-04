package top.liumuge.builder.improve;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/10
 * @time: 21:19
 * @description:
 */
public class CommonHouseBuilder extends HouseBuilder {

	@Override
	public void buildBasic() {
		System.out.println("普通 打地基");
	}

	@Override
	public void buildWalls() {
		System.out.println("普通 砌墙");
	}

	@Override
	public void roofed() {
		System.out.println("普通 封顶");
	}

}
