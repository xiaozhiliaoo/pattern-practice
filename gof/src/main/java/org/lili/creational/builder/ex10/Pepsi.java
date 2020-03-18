package org.lili.creational.builder.ex10;

/**
 * Created by lili on 2017/7/16.
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    public String name() {
        return "Pepsi";
    }
}
