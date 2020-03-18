package org.lili.structural.composite.ex5;

/**
 * Created by lili on 2017/7/13.
 */
public class Row extends Composite{
    public Row(int value) {
        super(value);
    }

    public void traverse() {
        System.out.print("Row");
        super.traverse();
    }
}
