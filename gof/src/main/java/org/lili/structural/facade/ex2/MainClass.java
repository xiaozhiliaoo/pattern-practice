package org.lili.structural.facade.ex2;

public class MainClass {
	public static void main(String[] args) {

		//买三种金融产品  客户端仅仅知道Facade  不需要调用子系统
		Gupiao gupiao = new Gupiao();
		gupiao.mai();

		Qihuo qihuo = new Qihuo();
		qihuo.chao();

		GuoZai guozhai = new GuoZai();
		guozhai.mai();

		//买基金A
		JiJin jijinA = new JiJin();
		jijinA.maiJijinA();

		//买基金B
		JiJin jijinB = new JiJin();
		jijinB.maiJijinB();
	}
}
