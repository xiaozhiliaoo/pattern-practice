package org.lili.structural.decorator.ex2;

public class MainClass {
	public static void main(String[] args) {
		//IO  只可以读的文件流成了可读+缓冲的文件流
		Car car = new RunCar();
		
		car.show();
		System.out.println("---------");

		//添加游泳功能
		Car swimcar = new SwimCarDecorator(car);
		swimcar.show();
		System.out.println("---------");

		//添加飞功能
		Car flySwimCar = new FlyCarDecorator(swimcar);
		flySwimCar.show();
	}
}
