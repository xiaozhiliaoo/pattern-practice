package org.lili.behavioral.visitor.ex1;

/**
 * Created by lili on 2017/8/7
 */
public class VisitorManager implements Visitor {
    public void visit(Park park) {
        System.out.println("管理员负责"+park.getName()+"检查");
    }

    public void visit(ParkA parkA) {
        System.out.println("管理员负责"+parkA.getName()+"检查");
    }

    public void visit(ParkB parkB) {
        System.out.println("管理员负责"+parkB.getName()+"检查");
    }
}
