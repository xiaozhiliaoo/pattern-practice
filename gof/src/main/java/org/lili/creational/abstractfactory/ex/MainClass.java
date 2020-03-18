package org.lili.creational.abstractfactory.ex;

/**
 * Created by lili on 2017/7/16.
 */
public class MainClass {
    public static void main(String[] args) {
        FruitFactory northFruitFactory = new NorthFruitFactory();
        northFruitFactory.getApple().get();
        northFruitFactory.getBanana().get();

        FruitFactory southFruitFactory = new SouthFruitFactory();
        southFruitFactory.getApple().get();
        southFruitFactory.getApple().get();

        //如果新增和修改呢？？？新增一个产品族。
    }
}
