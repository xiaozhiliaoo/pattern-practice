package org.lili.behavioral.chainofresponsibility.ex2;

public class CarHeadHandler extends CarHandler{

	public void handlerCar() {
		System.out.println("车头");
		//引用了下一个链对象  通过什么将不同对象关联起来~~~
		if(this.carHandler != null) {
			this.carHandler.handlerCar();
		}
	}
}
