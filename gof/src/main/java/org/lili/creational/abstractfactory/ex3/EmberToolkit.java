package org.lili.creational.abstractfactory.ex3;

/**
 * Created by lili on 2017/7/16
 */
public class EmberToolkit extends AbstractFactory{
    public CPU createCPU() {
        return new EmberCPU();
    }

    public MMU createMMU() {
        return new EmberMMU();
    }
}
