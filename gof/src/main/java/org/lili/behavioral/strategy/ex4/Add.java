package org.lili.behavioral.strategy.ex4;

/**
 * Created by lili on 2017/7/8.
 */
public class Add implements Strategy {
    public int execute(int a, int b) {
        System.out.println("Called Add's execute()");
        return a + b;  // Do an addition with a and b
    }
}
