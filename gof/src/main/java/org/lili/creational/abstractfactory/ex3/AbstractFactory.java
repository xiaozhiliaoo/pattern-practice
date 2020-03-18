package org.lili.creational.abstractfactory.ex3;

/**
 * Created by lili on 2017/7/16
 */
public  abstract class AbstractFactory {

    public abstract CPU createCPU();

    public abstract MMU createMMU();

    private static final EmberToolkit EMBER_TOOLKIT = new EmberToolkit();
    private static final EnginolaToolkit ENGINOLA_TOOLKIT = new EnginolaToolkit();

    static AbstractFactory getFactory(Architecture architecture){
        AbstractFactory factory = null;
        //使用枚举进行Switch判断比字符串好
        switch (architecture){
            case EMBER:factory = EMBER_TOOLKIT;break;
            case ENGINOLA:factory = ENGINOLA_TOOLKIT;break;
        }
        return factory;
    }
}
