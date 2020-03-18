package org.lili.structural.bridge.ex2;


public class Bus implements Car {

	//Car没有2000但是Jeep有  不得不实现空实现  使得接口设计不合理
	public void install2000Engine() {
	}

	public void install2200Engine() {
	}

	public void install2300Engine() {
	}
}
