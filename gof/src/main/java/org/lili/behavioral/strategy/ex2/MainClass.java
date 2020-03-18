package org.lili.behavioral.strategy.ex2;

public class MainClass {

	public static void main(String[] args) {

		double num = 200;

		Context context = new Context(new StrategyB());

		//子类实现了cost方法
		double newNum = context.cost(num);

		System.out.println("cost" + newNum + "rmb");
	}
}
