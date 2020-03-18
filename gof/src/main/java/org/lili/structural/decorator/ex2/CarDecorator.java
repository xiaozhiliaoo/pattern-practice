package org.lili.structural.decorator.ex2;

public abstract class CarDecorator implements Car{
	private Car car;
	
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public CarDecorator(Car car) {
		this.car = car;
	}
	
	public abstract void show();
}