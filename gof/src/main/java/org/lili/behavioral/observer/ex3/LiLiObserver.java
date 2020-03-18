package org.lili.behavioral.observer.ex3;

/**
 * Created by lili on 2017/8/3
 */
public class LiLiObserver implements MyObserver{
    public void update(MyObservable myObservable, Object arg) {
        System.out.println("对象发生改变");
    }
}
