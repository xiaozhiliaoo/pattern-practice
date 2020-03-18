package org.lili.creational.builder.ex10;

/**
 * Created by lili on 2017/7/16.
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    public String name() {
        return "Coke";
    }
}
