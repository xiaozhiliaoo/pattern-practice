package org.lili.creational.builder.ex2;

/**
 * Created by lili on 2017/7/16.
 */
public class CarDirector {
    private ICarBuilder carBuilder;

    public CarDirector(ICarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void constructCar(){
        carBuilder.makePartEnd();
        carBuilder.makePartFirst();
        carBuilder.makePartMiddle();
    }

}
