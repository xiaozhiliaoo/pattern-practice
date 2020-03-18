package org.lili.behavioral.strategy.ex2;

public class Context {

	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public double cost(double num){

		return this.strategy.cost(num);
	}
	
}
