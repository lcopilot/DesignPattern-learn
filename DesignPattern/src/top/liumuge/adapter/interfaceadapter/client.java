package top.liumuge.adapter.interfaceadapter;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/13
 * @time: 21:13
 * @description:
 */
public class client {

	public static void main(String[] args) {
		AbsAdapter absAdapter = new AbsAdapter() {
			@Override
			public void m1() {
				System.out.println("使用了m1");
			}
		};
		absAdapter.m1();
	}
}
