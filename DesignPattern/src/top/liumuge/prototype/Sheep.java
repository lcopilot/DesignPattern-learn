package top.liumuge.prototype;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/9
 * @time: 17:37
 * @description:
 */
public class Sheep{
	private String name;
	private Integer age;
	private String color;

	public Sheep(String name, Integer age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Sheep{" +
				"name='" + name + '\'' +
				", age=" + age +
				", color='" + color + '\'' +
				'}';
	}
}
