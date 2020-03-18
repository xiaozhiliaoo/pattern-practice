package org.lili.behavioral.strategy.ex4;

/**
 * Created by lili on 2017/7/8.
 */
public class Subtract implements Strategy {
    public int execute(int a, int b) {
        System.out.println("Called Subtract's execute()");
        return a - b;  // Do a subtraction with a and b
    }
}