package org.lili.principles.ocp.refactor;

/**
 * Created by lili on 2017/7/8.
 */
public class MainClass {
    public static void main(String[] args) {
        //存款
        BankWorker bankWorker = new SavingBankWorker();
        bankWorker.operation();

        //取款
        BankWorker bankWorker2 = new DrawingBankWorker();
        bankWorker2.operation();

        //转账
        BankWorker bankWorker3 = new ZhuanZhangBankWorker();
        bankWorker3.operation();

        //基金
        BankWorker bankWorker4 = new JiJinBankWorker();
        bankWorker4.operation();

        //通过扩展而实现增加功能，而不是通过原来源代码。 OCP：

    }
}