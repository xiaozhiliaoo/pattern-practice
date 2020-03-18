package org.lili.structural.bridge.ex1;

public class MainClass {
	public static void main(String[] args) {
		Car car1 = new Bus2000();
		car1.installEngine();
		//如果添加卡车，类将会膨胀，很大....
	}
}
