package top.liumuge.principle.inversion;

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
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息:hello,World";
    }
}

//完成Person接收消息的功能
//方式1
// 1.简单,比较容易想到
// 2.如果我们获取的对象是微信,短信等等,则新增类,同时 Person也要增加相应的接收方法
// 3.解决思路:引入一个抽象的接口工 Receiver,表示接收者,这样 Person类与接口 TReceiver发生依赖
//   因为Email, WeiXin等等属于接收的范围,他们各自实现工 Receiver接口就ok,这样我们就符合依赖倒转原则
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
