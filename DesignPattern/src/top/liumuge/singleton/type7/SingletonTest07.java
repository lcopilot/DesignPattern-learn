package top.liumuge.singleton.type7;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/7
 * @time: 10:34
 * @description:
 */
public class SingletonTest07 {
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

//* 静态内部类
class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    //* 静态内部类,该类中有一个静态属性 Singleton
    private static class SingletonInstance{
        private static final Singleton INSTANCE=new Singleton();
    }

    //* 提供一个静态公有方法 直接返回SingletonInstance.INSTANCE
    public static synchronized Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

}
