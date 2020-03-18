package org.lili.behavioral.templateMethod.ex1;

/**
 * Created by lili on 2017/7/8.
 */
public class MakeBus extends MakeCar {

    @Override
    public void makeHead() {
        System.out.println("bus:head");
    }

    @Override
    public void makeBody() {
        System.out.println("bus:body");
    }

    @Override
    public void makeTail() {
        System.out.println("bus:tail");
    }

    public void log(){
        System.out.println("Log。。。");
    }

    /*@Override
    public void interrupt() {
        System.out.println("interrupt at making car");
    }*/
}
