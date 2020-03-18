package org.lili.structural.proxy.ex2;

import java.lang.reflect.Proxy;

public class MainClass {
	//代理和拦截天生的关系    Struts2拦截器核心动态代理......
	public static void main(String[] args) {

		RealSubject realSubject = new RealSubject();

		MyHandler myHandler = new MyHandler();

		myHandler.setRealSubject(realSubject);
		
		Subject proxySubject = (Subject)Proxy.newProxyInstance(RealSubject.class.getClassLoader(),
							realSubject.getClass().getInterfaces(),
							myHandler
							);

		proxySubject.sellBook();
	}
}
