package org.lili.behavioral.visitor.ex2;

/**
 * Created by lili on 2017/8/7
 */
public class CarElementPrintVisitor implements CarElementVisitor {


    public void visit(Body body) {
        System.out.println("Visiting body");
    }

    public void visit(Car car) {
        System.out.println("Visiting car");
    }

    public void visit(Engine engine) {
        System.out.println("Visiting engine");
    }

    public void visit(Wheel wheel) {
        System.out.println("Visiting " + wheel.getName() + " wheel");
    }
}
