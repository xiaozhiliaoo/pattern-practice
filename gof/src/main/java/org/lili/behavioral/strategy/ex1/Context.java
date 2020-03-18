package org.lili.behavioral.strategy.ex1;

/**
 * Created by lili on 2017/7/8.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void encrypt(){
        this.strategy.encrypt();
    }
}
