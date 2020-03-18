package org.lili.structural.adapter.ex4;

/**
 * Created by lili on 2017/7/13.
 */

class Line {
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("Line from point A(" + x1 + ";" + y1 + "), to point B(" + x2 + ";" + y2 + ")");
    }
}

class Rectangle {
    public void draw(int x, int y, int width, int height) {
        System.out.println("Rectangle with coordinate left-down point (" + x + ";" + y + "), width: " + width
                + ", height: " + height);
    }
}

class LineAdapter implements Shape{

    private Line adaptee;

    public LineAdapter(Line adaptee) {
        this.adaptee = adaptee;
    }

    public void draw(int x1, int y1, int x2, int y2) {
        adaptee.draw(x1,y1,x2,y2);
    }
}

class RectangleAdapter implements Shape{

    private Rectangle adaptee;

    public RectangleAdapter(Rectangle adaptee) {
        this.adaptee = adaptee;
    }

    public void draw(int x1, int y1, int x2, int y2) {

        int x = Math.min(x1,x2);
        int y = Math.min(x2,y2);
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);
        adaptee.draw(x, y, width, height);
    }
}


public class AdapterDemo {
    public static void main(String[] args) {
        Shape[] shapes = {new LineAdapter(new Line()),
                new RectangleAdapter(new Rectangle())
        };
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;

        for(Shape shape:shapes){
            shape.draw(x1,y1,x2,y2);
        }
    }
}
