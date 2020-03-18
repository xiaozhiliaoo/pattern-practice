package org.lili.principles.ocp;


public class MainClass {
	public static void main(String[] args) {

		BankWorker bankWorker = new BankWorker();
		//存款
		bankWorker.saving();

		//取款
		bankWorker.drawing();

		//转账
		bankWorker.zhuanzhang();

		//基金
		bankWorker.jijin();

		//如果在新增一个的话，那么就要修改BankWorker源代码了.不符合OCP原则
	}
}

