package org.lili.structural.composite.ex5;

/**
 * Created by lili on 2017/7/13.
 */
public class Primitive implements Component {

    private int value;

    public Primitive(int value) {
        this.value = value;
    }

    public void traverse() {
        System.out.println(value+"    ");
    }
}
