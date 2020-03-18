package org.lili.behavioral.strategy.ex4;

/**
 * Created by lili on 2017/7/8.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return this.strategy.execute(a, b);
    }
}
