package org.lili.creational.builder.ex4;

/**
 * Created by lili on 2017/7/16.
 */
public class CarBuildDirector {
    private ICarBuilder carBuilder;

    public CarBuildDirector(ICarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car construct(){
        return carBuilder.setColor("Red").setWheels(5).build();
    }

    public static void main(String[] args) {

        //Car car = new CarBuildDirector(new CarBuilder()).construct();
        //System.out.println(car.getColor());

//        Car car = new CarBuildDirector(new CarBuilder()).construct();
//        System.out.println(car.getColor());

           ICarBuilder carBuilder = new CarBuilder();
           Car car = carBuilder.setColor("RED").setWheels(5).build();
           car.getColor();
    }
}
