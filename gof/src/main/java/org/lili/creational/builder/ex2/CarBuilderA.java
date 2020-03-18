package org.lili.creational.builder.ex2;

/**
 * Created by lili on 2017/7/16.
 */
public class CarBuilderA implements ICarBuilder{

    private Car car = new Car();

    public void makePartFirst() {
        car.setPartFirst("Fisrt");
    }

    public void makePartMiddle() {
        car.setPartMiddle("Middle");
    }

    public void makePartEnd() {
        car.setPartEnd("End");
    }

    public Car getResult(){
        return car;
    }
}
