package top.liumuge.singleton.type1;



/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/7
 * @time: 9:52
 * @description:
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        // 测试
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();
        System.out.println(instance3==instance2); //* true
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        System.out.println(instance3.hashCode());

    }
}

//*饿汉式 (静态变量)
class Singleton {
    //*1.构造器私有化,外部不能 new
    private Singleton() {

    }

    //*2.本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //*3.对外提供一个公有的静态方法,返回实例对象
    public static Singleton getInstance() {
        return instance;
    }

}


















