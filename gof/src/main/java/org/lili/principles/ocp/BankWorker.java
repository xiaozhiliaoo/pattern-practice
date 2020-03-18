package org.lili.principles.ocp;

/*
 * 银行业务员
 */
public class BankWorker {
	//负责存款业务
	public void saving() {
		System.out.println("进行存款操作");
	}

	//负责取款业务
	public void drawing() {
		System.out.println("进行取款操作");
	}

	//负责转账业务
	public void zhuanzhang() {
		System.out.println("进行转账操作");
	}

	//负责基金的申购
	public void jijin() {
		System.out.println("进行基金申购操作");
	}
}
