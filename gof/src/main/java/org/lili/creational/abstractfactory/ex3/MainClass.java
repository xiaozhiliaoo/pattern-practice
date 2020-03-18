package org.lili.creational.abstractfactory.ex3;

/**
 * Created by lili on 2017/7/16
 */
public class MainClass {
    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactory.getFactory(Architecture.EMBER);
        factory.createCPU().show();
        factory.createMMU().show();
    }
}
