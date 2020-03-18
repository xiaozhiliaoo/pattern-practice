package org.lili.structural.composite.ex2;

/**
 * Created by lili on 2017/7/13.
 */
public class MainClass {
    public static void main(String[] args) {

        //Initialize four ellipses
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        //Initialize three composite graphics
        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();
        CompositeGraphic graphicTOP = new CompositeGraphic();

        //Composes the graphics
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);

        graphic2.add(ellipse4);

        graphic.add(graphic1);
        graphic.add(graphic2);

        graphicTOP.add(graphic);
        graphicTOP.add(graphic);

        //Prints the complete graphic (four times the string "Ellipse").
        //打印了子节点
        graphicTOP.print();
    }
}
