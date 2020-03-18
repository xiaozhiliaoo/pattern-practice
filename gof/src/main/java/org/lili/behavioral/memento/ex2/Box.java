package org.lili.behavioral.memento.ex2;

/**
 * Created by lili on 2017/7/23
 */
public class Box{
    private String something;

    public Box(String something) {
        this.something = something;
    }

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }

    @Override
    public String toString() {
        return this.getSomething();
    }
}