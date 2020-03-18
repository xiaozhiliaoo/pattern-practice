package org.lili.creational.builder.ex5;

/**
 * Created by lili on 2017/7/16.
 */
public class SpicyPizzaBuilder  extends PizzaBuilder{
    public void buildDough() {
        pizza.setDough("pan baked");
    }

    public void buildSauce() {
        pizza.setSauce("hot");
    }

    public void buildTopping() {
        pizza.setTopping("pepperoni+salami");
    }
}
