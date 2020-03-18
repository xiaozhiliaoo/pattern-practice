package org.lili.creational.builder.ex10;

/**
 * Created by lili on 2017/7/16.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        builder.prepareNonVegMeal().showItems();
        builder.prepareVegMeal().showItems();
    }
}
