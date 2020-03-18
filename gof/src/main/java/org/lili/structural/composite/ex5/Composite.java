package org.lili.structural.composite.ex5;

/**
 * Created by lili on 2017/7/13.
 */
public class Composite implements Component {


    private Component[] children = new Component[9];

    private int total = 0;

    private int value ;

    public Composite(int value) {
        this.value = value;
    }

    public void add(Component c){
        children[total++] = c;
    }



    public void traverse() {
        System.out.print(value+" ");
        for (int i = 0; i < total; i++) {
            children[i].traverse();
        }
    }
}
