package org.lili.behavioral.visitor.ex2;

/**
 * Created by lili on 2017/8/7
 */
public class Engine implements CarElement{

    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
