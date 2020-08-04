package top.liumuge.builder;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/10
 * @time: 18:17
 * @description:
 */
public class CommonHouse extends AbstractHouse {

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
