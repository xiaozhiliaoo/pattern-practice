package org.lili.creational.abstractfactory.ex;


//产品族
public class NorthFruitFactory implements FruitFactory {

	public Fruit getApple() {
		return new NorthApple();
	}

	public Fruit getBanana() {
		return new NorthBanana();
	}
}
