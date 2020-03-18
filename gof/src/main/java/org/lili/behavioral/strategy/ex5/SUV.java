package org.lili.behavioral.strategy.ex5;

/**
 * Created by lili on 2017/7/8.
 */
public class SUV extends Car {
    public SUV() {
        this.brakeBehavior = new BrakeWithABS();
    }
}
