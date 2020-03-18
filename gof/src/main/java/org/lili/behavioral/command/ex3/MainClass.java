package org.lili.behavioral.command.ex3;

public class MainClass {
	public static void main(String[] args) {
		//Reveiver
		Peddler peddler = new Peddler();
//		peddler.sailApple();
//		peddler.sailBanana();
		//Command
		Command appleCommand = new AppleCommand(peddler);
		Command bananaCommand = new BananaCommand(peddler);
//		appleCommand.sail();
//		bananaCommand.sail();
		//Caller/Invoker
//		Waiter waiter = new Waiter(appleCommand);
//		waiter.sail();
//		Waiter waiter2 = new Waiter(bananaCommand);
//		waiter.sail();
		//Caller/Invoker
		Waiter2 waiter = new Waiter2();
		waiter.setOrder(appleCommand);
		waiter.setOrder(appleCommand);
		waiter.setOrder(bananaCommand);
		waiter.removeOrder(appleCommand);
		waiter.sail();

	}
}
