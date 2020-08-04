package top.liumuge.singleton.type3;



/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/7
 * @time: 10:34
 * @description:
 */
public class SingletonTest03 {
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

//* 懒汉式(线程不安全)
class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    //* 提供静态的公有方法,当使用该方法时才创建instance
    public static  Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
