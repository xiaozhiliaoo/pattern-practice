package org.lili.creational.builder.ex5;

/**
 * Created by lili on 2017/7/16.
 */
public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza(){
        return pizza;
    }

    public void createNewPizzProduct(){
        pizza = new Pizza();
    }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}
