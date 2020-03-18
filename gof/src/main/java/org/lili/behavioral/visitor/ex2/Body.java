package org.lili.behavioral.visitor.ex2;

/**
 * Created by lili on 2017/8/7
 */

//在元素中接受Visitor
public class Body implements CarElement{

    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
