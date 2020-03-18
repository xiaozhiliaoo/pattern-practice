package org.lili.creational.builder.ex4;

/**
 * Created by lili on 2017/7/16.
 */
public interface ICarBuilder {
    Car build();
    ICarBuilder setColor(final String color);
    ICarBuilder setWheels(final int wheels);
}
