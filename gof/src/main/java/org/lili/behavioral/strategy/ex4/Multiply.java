package org.lili.behavioral.strategy.ex4;

/**
 * Created by lili on 2017/7/8.
 */
public class Multiply implements Strategy {
    public int execute(int a, int b) {
        System.out.println("Called Multiply's execute()");
        return a * b;   // Do a multiplication with a and b
    }
}
