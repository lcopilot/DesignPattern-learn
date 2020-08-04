package top.liumuge.principle.inversion.improve;

/**
 * @program: DesignPatterns
 * @auther: MuGe
 * @date: 2020/6/18
 * @time: 13:00
 * @description:
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new WeiXin());
    }
}

interface IReceiver {
    String getInfo();
}

class WeiXin implements IReceiver {

    @Override
    public String getInfo() {
        return "微信消息:hello,World";
    }
}

class Email implements IReceiver {
    public String getInfo() {
        return "电子邮件信息:hello,World";
    }
}

//完成Person接收消息的功能
//方式2
class Person {
    public void receive(IReceiver receive) {
        System.out.println(receive.getInfo());
    }
}
