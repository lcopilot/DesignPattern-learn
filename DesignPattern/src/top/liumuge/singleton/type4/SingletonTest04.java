package top.liumuge.singleton.type4;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/7
 * @time: 10:34
 * @description:
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        // 测试
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();
        System.out.println(instance3 == instance2); //* true
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        System.out.println(instance3.hashCode());
    }
}

//* 懒汉式(线程安全,同步方法)
class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    //* 加入同步代码,解决线程不安全问题
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
