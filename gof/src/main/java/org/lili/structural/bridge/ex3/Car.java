package org.lili.structural.bridge.ex3;

public abstract class Car {

	//桥接就在于引用。可以传递不同的子类，有了共同方法，就可以调用了。
	// 桥就是引用。

	private Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	//非模板方法模式
	public abstract void installEngine();
}
