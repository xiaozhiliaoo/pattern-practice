package org.lili.behavioral.visitor.ex1;

/**
 * Created by lili on 2017/8/7
 */
public class VisitorB implements Visitor {
    public void visit(Park park) {

    }

    public void visit(ParkA parkA) {

    }

    public void visit(ParkB parkB) {
        System.out.println("清洁工B完成公园"+parkB.getName()+"清扫");
    }
}
