package top.liumuge.prototype.improve;


/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/9
 * @time: 18:18
 * @description:
 */
public class Client {

	public static void main(String[] args) {
		Sheep sheep = new Sheep("tom", 18, "白色");
		sheep.friend=new Sheep("jack", 25, "蓝色");

		Sheep sheep1 = (Sheep) sheep.clone();  //克隆
		Sheep sheep2 = (Sheep) sheep.clone();  //克隆
		Sheep sheep3 = (Sheep) sheep.clone();
		Sheep sheep4 = (Sheep) sheep.clone();
		Sheep sheep5 = (Sheep) sheep.clone();



		System.out.println(sheep);
		System.out.println(sheep1);
		System.out.println(sheep2);
		System.out.println(sheep3);
		System.out.println(sheep4);
		System.out.println(sheep5);

	}
}
