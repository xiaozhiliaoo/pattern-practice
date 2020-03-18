package org.lili.creational.builder.ex2;

/**
 * Created by lili on 2017/7/16.
 */
public class MainClass {
    public static void main(String[] args) {
        CarBuilderA carBuilder = new CarBuilderA();
        CarDirector director = new CarDirector(carBuilder);
        director.constructCar();
        //这里通过construct直接返回Car好还是carBuilder返回好？第一者较好 因为Client只需要和
        //director进行交互了  也可以理解为director组装者，具体的获取还是要在Builder里面
        //像JDBC就不适合Builder,语义不是创建对象
        Car result = carBuilder.getResult();
        System.out.println(result.getPartEnd());
    }
}
