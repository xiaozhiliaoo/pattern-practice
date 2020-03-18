package org.lili.behavioral.strategy.ex5;

/**
 * Created by lili on 2017/7/8.
 */
public class Sedan extends Car {
    public Sedan() {
        this.brakeBehavior = new Brake();
    }
}
