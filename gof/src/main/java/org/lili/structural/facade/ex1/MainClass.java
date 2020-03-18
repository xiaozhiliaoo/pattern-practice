package org.lili.structural.facade.ex1;

public class MainClass {
	public static void main(String[] args) {

		//无facade实现调用子系统模块  客户端直接和子系统交互   错综复杂
 		SystemA systemA = new SystemA();
		systemA.doSomething();
		SystemB systemB = new SystemB();
		systemB.doSomething();
		SystemC systemC = new SystemC();
		systemC.doSomething();

		//通过Facade进行交互   细节隐藏在Facade里面了
		Facade facade = new Facade();
		facade.doABC();


	}
}
