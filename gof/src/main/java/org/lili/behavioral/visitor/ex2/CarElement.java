package org.lili.behavioral.visitor.ex2;

/**
 * Created by lili on 2017/8/7
 */
public interface CarElement {
    void accept(CarElementVisitor visitor);
}
