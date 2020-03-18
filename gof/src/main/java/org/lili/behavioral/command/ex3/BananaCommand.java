package org.lili.behavioral.command.ex3;

public class BananaCommand extends Command {

	public BananaCommand(Peddler peddler) {
		super(peddler);
	}

	//添加额外功能  有点像代理模式
	public void sail() {
		System.out.println("额外处理.....");
		this.getPeddler().sailBanana();
	}

}
