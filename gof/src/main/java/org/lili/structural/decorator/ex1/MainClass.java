package org.lili.structural.decorator.ex1;

public class MainClass {
	public static void main(String[] args) {
		Car flycar = new SwimCar();
		flycar.show();
	}
}
