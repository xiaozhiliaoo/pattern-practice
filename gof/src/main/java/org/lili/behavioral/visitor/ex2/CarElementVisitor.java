package org.lili.behavioral.visitor.ex2;

/**
 * Created by lili on 2017/8/7
 */
public interface CarElementVisitor {

    void visit(Body body);

    void visit(Car car);

    void visit(Engine engine);

    void visit(Wheel wheel);

}
