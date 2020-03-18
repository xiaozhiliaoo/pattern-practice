package org.lili.creational.abstractfactory.ex4;

/**
 * Created by lili on 2017/7/16
 */
public class FactoryFmProto {
    public static void main(String[] args) {
//        args = {"1","2"};
        AbstractFactory factory = null;
        if(args.length>0){
            factory = new PCFactory();
        }else{
            factory = new NotPCFactory();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(factory.makePhase()+"  ");
        }

        System.out.println();

        System.out.println(factory.makeCompromise());
        System.out.println(factory.makeGrade());

    }
}
