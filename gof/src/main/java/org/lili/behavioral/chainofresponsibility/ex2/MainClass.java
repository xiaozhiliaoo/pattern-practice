package org.lili.behavioral.chainofresponsibility.ex2;

public class MainClass {
	public static void main(String[] args) {
		CarHandler headH = new CarHeadHandler();
		CarHandler bodyH = new CarBodyHandler();
		CarHandler tailH = new CarTailHandler();

		//人为设置好顺序
		headH.setNextHandler(bodyH);
		bodyH.setNextHandler(tailH);
		

		headH.handlerCar();

		//改变顺序
		bodyH.setNextHandler(headH);
		headH.setNextHandler(tailH);
		bodyH.handlerCar();

		//链式调用   简便操作
		bodyH.setNextHandler(headH).setNextHandler(tailH);
		bodyH.handlerCar();
		
		
	}
}
