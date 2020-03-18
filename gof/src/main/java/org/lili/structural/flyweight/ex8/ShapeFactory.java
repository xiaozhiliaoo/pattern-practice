package org.lili.structural.flyweight.ex8;

import java.util.HashMap;

/**
 * Created by lili on 2017/7/11.
 */
public class ShapeFactory {

    private static final HashMap<String,Shape> map = new HashMap<String, Shape>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) map.get(color);
        if(circle == null){
            circle = new Circle(color);
            map.put(color,circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
