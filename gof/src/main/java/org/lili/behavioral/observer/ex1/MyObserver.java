package org.lili.behavioral.observer.ex1;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by lili on 2017/8/3
 */
public class MyObserver implements Observer {
    public void update(Observable o, Object arg) {
        System.out.println(o.getClass());
        System.out.println("对象发生变化");
    }
}
