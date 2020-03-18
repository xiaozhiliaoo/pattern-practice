package org.lili.behavioral.chainofresponsibility.ex2;

public class CarTailHandler extends CarHandler{

	public void handlerCar() {
		System.out.println("车尾");
		if(this.carHandler != null) {
			this.carHandler.handlerCar();
		}
	}
}
