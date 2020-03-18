package org.lili.behavioral.strategy.ex5;

/**
 * Created by lili on 2017/7/8.
 */
public class BrakeWithABS implements IBrakeBehavior {
    public void brake() {
        System.out.println("Brake with ABS applied");
    }
}
