package org.lili.creational.builder.ex5;

/**
 * Created by lili on 2017/7/16.
 */
public class PizzaBuilderDemo {
    public static void main(String[] args) {
        Waiter w = new Waiter();
        PizzaBuilder builder = new HawaiianPizzaBuilder();
        w.setBuilder(builder);
        w.constructPizza();
        Pizza pizza = w.getPizza();
    }
}
