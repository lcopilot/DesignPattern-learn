package top.liumuge.builder.improve;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/10
 * @time: 21:15
 * @description:
 */
//抽象的建造者
public abstract class HouseBuilder {

	protected House house=new House();
	//打地基
	public abstract void buildBasic();

	//砌墙
	public abstract void buildWalls();

	//封顶
	public abstract void roofed();

	public House buildHose() {
		return house;
	}
}
