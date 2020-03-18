package org.lili.behavioral.strategy.ex5;

/**
 * Created by lili on 2017/7/8.
 */
public abstract class Car {
    protected IBrakeBehavior brakeBehavior;

    public void setBrakeBehavior(IBrakeBehavior brakeBehavior) {
        this.brakeBehavior = brakeBehavior;
    }

    public void applyBrake(){
        brakeBehavior.brake();
    }
}
