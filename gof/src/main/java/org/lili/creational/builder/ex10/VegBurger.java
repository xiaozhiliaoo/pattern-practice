package org.lili.creational.builder.ex10;

/**
 * Created by lili on 2017/7/16.
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }


    public String name() {
        return "Veg Burger";
    }
}
