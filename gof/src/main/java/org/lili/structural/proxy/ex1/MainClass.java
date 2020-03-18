package org.lili.structural.proxy.ex1;

/**
 * Created by lili on 2017/7/14.
 */
public class MainClass {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        realSubject.sellBook();
        System.out.println("------------------------------------");
        ProxySubject proxySubject = new ProxySubject();
        proxySubject.setRealSubject(realSubject);
        proxySubject.sellBook();
    }
}
