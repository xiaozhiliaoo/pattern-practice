package org.lili.behavioral.strategy.ex3;

/**
 * Created by lili on 2017/7/8.
 */
public class HappyHourStrategy implements BillingStrategy {
    public double getActPrice(double rawPrice) {
        return rawPrice*0.5;
    }
}
