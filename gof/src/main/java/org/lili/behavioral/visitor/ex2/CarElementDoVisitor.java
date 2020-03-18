package org.lili.behavioral.visitor.ex2;

/**
 * Created by lili on 2017/8/7
 */
public class CarElementDoVisitor implements CarElementVisitor {
    public void visit(Body body) {
        System.out.println("Moving my body");
    }

    public void visit(Car car) {
        System.out.println("Starting my car");
    }

    public void visit(Engine engine) {
        System.out.println("Starting my engine");
    }

    public void visit(Wheel wheel) {
        System.out.println("Kicking my " + wheel.getName() + " wheel");

    }
}
