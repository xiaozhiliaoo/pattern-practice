package org.lili.structural.composite.ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lili on 2017/7/13.
 */
public class CompositeGraphic implements Graphic {

    private List<Graphic> childGraphics = new ArrayList<Graphic>();


    public void print() {
        for (Graphic graphic:childGraphics){
            graphic.print();
        }
    }

    public void add(Graphic graphic){
        childGraphics.add(graphic);
    }

    public void remove(Graphic graphic){
        childGraphics.remove(graphic);
    }
}
