package org.lili.behavioral.observer.ex3;

/**
 * Created by lili on 2017/8/3
 */
public class MainClass {
    public static void main(String[] args) {
        //JDK提供了观察者模式的简单实现
        PersonSubject personSubject = new PersonSubject();
        personSubject.addObserver(new LiLiObserver());
        personSubject.setName("lili");
        personSubject.setAge(123);
    }
}
