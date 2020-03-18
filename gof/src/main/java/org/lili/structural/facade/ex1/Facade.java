package org.lili.structural.facade.ex1;

public class Facade {
	//子系统  核心，持有对象引用
	private SystemA systemA;
	private SystemB systemB;
	private SystemC systemC;
	
	public Facade() {
		systemA = new SystemA();
		systemB = new SystemB();
		systemC = new SystemC();
	}
	
	public void doABC() {
		this.systemA.doSomething();
		this.systemB.doSomething();
		this.systemC.doSomething();
	}
	
	public void doAB() {
		this.systemA.doSomething();
		this.systemB.doSomething();
	}

	public void doBC(){
		this.systemB.doSomething();
		this.systemC.doSomething();
	}
}
