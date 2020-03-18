package org.lili.creational.abstractfactory.ex;

public class SouthFruitFactory implements FruitFactory {

	public Fruit getApple() {
		return new SouthApple();
	}

	public Fruit getBanana() {
		return new SouthBanana();
	}

}
