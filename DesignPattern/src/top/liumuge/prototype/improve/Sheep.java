package top.liumuge.prototype.improve;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/9
 * @time: 17:37
 * @description:
 */
public class Sheep implements Cloneable{
	private String name;
	private Integer age;
	private String color;
	public Sheep friend;

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
				", friend=" + friend.hashCode() +
				'}';
	}

	/**
	 * 克隆该实例,使用默认的clone方法来完成
	 * @return
	 * @throws CloneNotSupportedException
	 */
	@Override
	protected Object clone()  {
		Sheep sheep=null;
		try {
			sheep =(Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return sheep;
	}
}
