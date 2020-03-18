package org.lili.creational.builder.ex10;

/**
 * Created by lili on 2017/7/16.
 */
public abstract class Burger implements Item{
//    public String name() {
//        return null;
//    }

    public Packing packing() {

        return new Wrapper();
    }

    public abstract float price();
}
