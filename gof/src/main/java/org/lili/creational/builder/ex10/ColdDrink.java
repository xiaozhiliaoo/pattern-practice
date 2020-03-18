package org.lili.creational.builder.ex10;

/**
 * Created by lili on 2017/7/16.
 */
public abstract class ColdDrink implements Item{

    public Packing packing() {
        return new Bottle() ;
    }

    public abstract float price() ;
}
