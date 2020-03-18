package org.lili.structural.adapter.ex3;

/**
 * Created by lili on 2017/7/13.
 */
public class AdapterDemo {
    //在没有适配器模式下
    public static void main(String[] args) {
        Object[] shapes = {new Line(), new Rectangle()};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        int width = 40, height = 40;
        for(Object shape:shapes){
            if(shape.getClass().getSimpleName().equals("Line")){
                ((Line)shape).draw(x1,y1,x2,y2);
            }else if(shape.getClass().getSimpleName().equals("Rectangle")){
                ((Rectangle)shape).draw(x1,y1,width,height);
            }
        }
    }
}
