package org.lili.behavioral.chainofresponsibility.ex2;

public class CarBodyHandler extends CarHandler {

	public void handlerCar() {
		System.out.println("车身");
		if(this.carHandler != null) {
			this.carHandler.handlerCar();
		}
	}

}
