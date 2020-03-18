package org.lili.structural.decorator.ex1;

public class SwimCar implements Car{

	public void run() {
		System.out.println("可以跑");
	}

	public void swim() {
		System.out.println("可以游泳");
	}
	
	public void show() {
		this.run();
		this.swim();
	}

}
