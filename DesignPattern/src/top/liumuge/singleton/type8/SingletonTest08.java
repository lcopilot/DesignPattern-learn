package top.liumuge.singleton.type8;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/7/7
 * @time: 16:03
 * @description:
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance==instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}


enum Singleton{
    INSTANCE;
    public void sayOK(){
        System.out.println("ok");
    }
}