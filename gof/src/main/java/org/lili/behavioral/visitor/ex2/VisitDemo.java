package org.lili.behavioral.visitor.ex2;

/**
 * Created by lili on 2017/8/7
 */
public class VisitDemo {
    public static void main(String[] args) {
        final Car car = new Car();
        car.accept(new CarElementDoVisitor());
        car.accept(new CarElementPrintVisitor());
    }
}
