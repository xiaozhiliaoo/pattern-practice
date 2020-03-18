package org.lili.creational.builder.ex4;

/**
 * Created by lili on 2017/7/16.
 */
public class CarBuilder implements ICarBuilder {

    private Car car;

    public CarBuilder() {
        this.car = new Car();
    }

    public Car build() {
        return car;
    }

    public ICarBuilder setColor(String color) {
        car.setColor(color);
        return this;
    }

    public ICarBuilder setWheels(int wheels) {
        car.setWheels(wheels);
        return this;
    }
}
