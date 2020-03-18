package org.lili.behavioral.templateMethod.ex1;


/**
 * Created by lili on 2017/7/8.
 */
public class Man extends Person{
    public Man(int age, String name) {
        super(age, name);
    }

    public void doSomething(){
        System.out.println("do something。。。");
    }

    public static void main(String[] args) {
        Person p = new Man(1,"xiaoming");
        p.say();
//        p.doSomething();

    }
}
