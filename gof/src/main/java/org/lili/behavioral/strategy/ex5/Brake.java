package org.lili.behavioral.strategy.ex5;

/**
 * Created by lili on 2017/7/8.
 */
public class Brake implements IBrakeBehavior {
    public void brake() {
        System.out.println("Simple Brake applied");
    }
}
