package org.lili.creational.abstractfactory.ex4;

/**
 * Created by lili on 2017/7/16
 */
public class Expression implements Cloneable {
    private String str;

    public Expression(String str) {
        this.str = str;
    }

    @Override
    public Expression clone(){
        Expression clone = null;
        try {
            clone = (Expression) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public String toString() {
        return str;
    }
}
