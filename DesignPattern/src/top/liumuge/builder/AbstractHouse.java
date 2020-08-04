package top.liumuge.builder;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/10
 * @time: 18:14
 * @description:
 */
public abstract class AbstractHouse {

	//打地基
	public abstract void buildBasic();

	//砌墙
	public abstract void buildWalls();

	//封顶
	public abstract void roofed();

	public void build() {
		buildBasic();
		buildWalls();
		roofed();
	}

}
