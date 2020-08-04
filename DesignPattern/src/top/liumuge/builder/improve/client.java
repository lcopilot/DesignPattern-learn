package top.liumuge.builder.improve;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/10
 * @time: 21:33
 * @description:
 */
public class client {

	public static void main(String[] args) {
		//普通
		CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
		//创建房子的指挥者
		HouseDirector houseDirector = new HouseDirector(commonHouseBuilder);
		//完成
		houseDirector.constructHouse();

		System.out.println("====================");

		//高楼
		HighHouseBuilder highHouseBuilder = new HighHouseBuilder();
		houseDirector.setHouseBuilder(highHouseBuilder);
		houseDirector.constructHouse();


	}
}
