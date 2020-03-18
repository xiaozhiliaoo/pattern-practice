package org.lili.behavioral.chainofresponsibility.ex4;

/**
 * Created by lili on 2017/8/2
 */
public class VicePresidentPPower extends PurchasePower {
    protected double getAllowable() {
        return BASE * 40;
    }

    protected String getRole() {
        return "Vice President";
    }
}
