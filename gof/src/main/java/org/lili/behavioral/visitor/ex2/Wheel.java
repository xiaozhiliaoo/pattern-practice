package org.lili.behavioral.visitor.ex2;

/**
 * Created by lili on 2017/8/7
 */
public class Wheel implements CarElement{
    private String name;

    public Wheel(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
