package top.liumuge.singleton.type6;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/7
 * @time: 10:34
 * @description:
 */
public class SingletonTest06 {
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

//* 双重检查
class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    //* 加入双重检查代码,解决线程安全问题,同时解决懒加载问题
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class){
                if (instance==null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
