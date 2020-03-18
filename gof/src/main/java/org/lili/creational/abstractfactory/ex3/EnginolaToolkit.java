package org.lili.creational.abstractfactory.ex3;

/**
 * Created by lili on 2017/7/16
 */
public class EnginolaToolkit extends AbstractFactory {
    public CPU createCPU() {
        return new EnginolaCPU();
    }

    public MMU createMMU() {
        return new EnginolaMMU();
    }
}
