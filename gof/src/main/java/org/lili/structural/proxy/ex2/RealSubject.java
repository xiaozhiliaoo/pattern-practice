package org.lili.structural.proxy.ex2;

/**
 * Created by lili on 2017/7/14.
 */
public class RealSubject implements Subject {
    public void sellBook() {
        System.out.println("卖书....");
    }
}
