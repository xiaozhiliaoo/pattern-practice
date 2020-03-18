package org.lili.behavioral.observer.ex1;

/**
 * Created by lili on 2017/8/3
 */
public class MainClass {
    public static void main(String[] args) {
        //JDK提供了观察者模式的简单实现
        PersonSubject personSubject = new PersonSubject();
        personSubject.addObserver(new MyObserver());
        personSubject.setName("lili");
        personSubject.setAge(123);
    }
}
