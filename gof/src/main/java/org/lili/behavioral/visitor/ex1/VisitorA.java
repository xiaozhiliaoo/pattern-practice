package org.lili.behavioral.visitor.ex1;

/**
 * Created by lili on 2017/8/7
 */
public class VisitorA implements Visitor {


    public void visit(Park park) {

    }

    public void visit(ParkA parkA) {
        System.out.println("清洁工A完成公园"+parkA.getName()+"清扫");
    }

    public void visit(ParkB parkB) {

    }
}
