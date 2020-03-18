package org.lili.behavioral.state.ex1;

/**
 * Created by lili on 2017/7/8.
 */
public class MainClass {
    public static void main(String[] args) {
        Person p = new Person();
        p.setHour(7);
        p.doSth();
        p.setHour(12);
        p.doSth();
        p.setHour(18);
        p.doSth();
        p.setHour(1);
        p.doSth();
    }
}
