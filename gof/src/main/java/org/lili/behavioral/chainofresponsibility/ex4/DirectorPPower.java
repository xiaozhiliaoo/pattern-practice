package org.lili.behavioral.chainofresponsibility.ex4;

/**
 * Created by lili on 2017/8/2
 */
public class DirectorPPower extends PurchasePower {
    protected double getAllowable() {
        return BASE*20;
    }

    protected String getRole() {
        return "Director";
    }
}
