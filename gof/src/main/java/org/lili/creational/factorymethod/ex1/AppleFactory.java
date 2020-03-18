package org.lili.creational.factorymethod.ex1;

public class AppleFactory implements FruitFactory {

	public Fruit getFruit() {
		return new Apple();
	}
}
