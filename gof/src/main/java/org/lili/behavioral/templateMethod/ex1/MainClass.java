package org.lili.behavioral.templateMethod.ex1;

/**
 * Created by lili on 2017/7/8.
 */
public class MainClass {
    public static void main(String[] args) {
        MakeCar bus = new MakeBus();
        // bus.makeHead();
        // bus.makeBody();
        // bus.makeTail();
        //具体怎么build,交给了具体实现类
        bus.build();
//        bus.interrupt();
//        bus.log();

        MakeCar jeep = new MakeJeep();
        jeep.makeHead();
        jeep.makeBody();
        jeep.makeTail();
    }
}
