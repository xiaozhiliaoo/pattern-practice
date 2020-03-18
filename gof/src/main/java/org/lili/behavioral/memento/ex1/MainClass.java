package org.lili.behavioral.memento.ex1;

/**
 * Created by lili on 2017/7/23
 */
public class MainClass {
    public static void main(String[] args) {
        //1  client职责太多
        //2  如果换一个对象呢？不通用
        Person per = new Person("lili","boy",12);
        System.out.println("初始状态：");
        per.display();
        //保存对象状态
        Person backup = new Person();
        backup.setName(per.getName());
        backup.setAge(per.getAge());
        backup.setSex(per.getSex());

        //修改
        per.setAge(20);
        System.out.println("修改状态：");
        per.display();

        //undo还原
        per.setName(backup.getName());
        per.setSex(backup.getSex());
        per.setAge(backup.getAge());

        System.out.println("还原状态：");
        per.display();

    }
}
