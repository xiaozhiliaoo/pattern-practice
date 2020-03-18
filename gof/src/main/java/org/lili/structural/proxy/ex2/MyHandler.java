package org.lili.structural.proxy.ex2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by lili on 2017/7/14.
 */
public class MyHandler implements InvocationHandler{

    private RealSubject realSubject;

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        dazhe();
        result = method.invoke(realSubject, args);
        give();
        return result;
    }

    public void dazhe(){
        System.out.println("打折...");
    }

    public void give(){
        System.out.println("赠送代金券...");
    }

    public void setRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }
}
