package org.lili.principles.ocp.refactor;

/**
 * Created by lili on 2017/7/8.
 */
/*
 * 负责取款业务的业务员
 */
public class DrawingBankWorker  implements BankWorker{

    public void operation() {
        System.out.println("进行取款操作");
    }

}
