package org.lili.behavioral.strategy.ex3;

/**
 * Created by lili on 2017/7/8.
 */
public class NormalStrategy implements BillingStrategy {


    public double getActPrice(double rawPrice) {
        return rawPrice;
    }
}
