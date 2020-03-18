package org.lili.structural.proxy.ex1;

/**
 * Created by lili on 2017/7/14.
 */
//Subject接口....
public class ProxySubject implements Subject{
    private Subject realSubject;

    public void setRealSubject(Subject realSubject) {
        this.realSubject = realSubject;
    }

    public void sellBook() {
        //AOP雏形
        this.dazhe();
        this.realSubject.sellBook();
        this.give();
    }

    public void dazhe(){
        System.out.println("打折...");
    }

    public void give(){
        System.out.println("赠送代金券...");
    }
}
