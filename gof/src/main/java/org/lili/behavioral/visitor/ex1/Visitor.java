package org.lili.behavioral.visitor.ex1;

/**
 * Created by lili on 2017/8/7
 */
public interface Visitor {

    public void visit(Park park);

    public void visit(ParkA parkA);

    public void visit(ParkB parkB);

}
