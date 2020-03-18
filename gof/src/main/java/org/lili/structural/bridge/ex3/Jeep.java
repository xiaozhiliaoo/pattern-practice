package org.lili.structural.bridge.ex3;

public class Jeep extends Car {

	public Jeep(Engine engine) {
		super(engine);
	}

	public void installEngine() {
		System.out.print("JeepInstall");
		this.getEngine().installEngine();
	}
}
