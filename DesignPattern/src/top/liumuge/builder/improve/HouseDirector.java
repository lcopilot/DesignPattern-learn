package top.liumuge.builder.improve;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/10
 * @time: 21:24
 * @description:
 */
//指挥者,指定制作流程,返回
public class HouseDirector {

	HouseBuilder houseBuilder = null;

	//构造器传入houseBuilder
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	//如何处理建造房子的流程,交给指挥者
	public House constructHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.roofed();
		return houseBuilder.buildHose();
	}
}
