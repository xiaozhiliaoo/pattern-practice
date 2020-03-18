package org.lili.behavioral.chainofresponsibility.ex2;

/**
 * Created by lili on 2017/8/2
 */

public abstract class CarHandler {

    //子类需要引用 不能为private
    protected CarHandler carHandler;

    public CarHandler setNextHandler(CarHandler carHandler){
        this.carHandler = carHandler;
        return this.carHandler;
    }

    public abstract void handlerCar();
}
