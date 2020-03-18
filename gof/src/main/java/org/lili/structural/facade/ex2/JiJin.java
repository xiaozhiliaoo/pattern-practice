package org.lili.structural.facade.ex2;

public class JiJin {
	private Gupiao gupiao;
	private GuoZai guozai;
	private Qihuo qihuo;
	
	public JiJin() {
		this.guozai = new GuoZai();
		this.gupiao = new Gupiao();
		this.qihuo = new Qihuo();
	}

	//购买基金A
	public void maiJijinA() {
		this.guozai.mai();
		this.gupiao.mai();
	}

	//购买基金B
	public void maiJijinB() {
		this.guozai.mai();
		this.gupiao.mai();
		this.qihuo.chao();
	}
}
