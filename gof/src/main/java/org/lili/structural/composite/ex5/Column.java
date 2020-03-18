package org.lili.structural.composite.ex5;

/**
 * Created by lili on 2017/7/13.
 */
public class Column extends Composite {

    public Column(int value) {
        super(value);
    }

    public void traverse() {
        System.out.print("Col");
        super.traverse();
    }
}
