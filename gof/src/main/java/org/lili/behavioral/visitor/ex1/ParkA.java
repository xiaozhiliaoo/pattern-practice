package org.lili.behavioral.visitor.ex1;

/**
 * Created by lili on 2017/8/7
 */
//ConcreteElementA
public class ParkA implements ParkElement {


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
