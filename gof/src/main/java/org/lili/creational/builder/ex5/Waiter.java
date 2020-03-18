package org.lili.creational.builder.ex5;

/**
 * Created by lili on 2017/7/16.
 */
public class Waiter {
    private PizzaBuilder builder;

    public void setBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza getPizza(){
        return builder.getPizza();
    }

    public void constructPizza(){
        builder.createNewPizzProduct();
        builder.buildDough();
        builder.buildSauce();
        builder.buildTopping();
    }


}
