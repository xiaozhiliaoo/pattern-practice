package org.lili.structural.bridge.ex3;

public class Bus extends Car{

	public Bus(Engine engine) {
		super(engine);
	}

	public void installEngine() {
		System.out.print("BusInstall");
		this.getEngine().installEngine();
	}
}
