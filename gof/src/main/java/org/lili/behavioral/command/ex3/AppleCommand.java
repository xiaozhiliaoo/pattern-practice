package org.lili.behavioral.command.ex3;

public class AppleCommand extends Command {

	public AppleCommand(Peddler peddler) {
		super(peddler);
	}

	public void sail() {
		System.out.println("额外处理.....");
		this.getPeddler().sailApple();
	}
	
}
