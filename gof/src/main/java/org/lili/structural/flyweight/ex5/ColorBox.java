package org.lili.structural.flyweight.ex5;

import java.awt.*;

/**
 * Created by lili on 2017/7/10.
 */
public class ColorBox extends Canvas{

    //随机获取颜色
    private Color curColor = getColor();

    private static Color[] colors = { Color.black, Color.blue, Color.cyan,
            Color.darkGray, Color.gray, Color.green, Color.lightGray, Color.red,
            Color.magenta, Color.orange, Color.pink, Color.white, Color.yellow };

    public ColorBox(ThreadPool tp) {
        //创建ColorBox对象 注册到线程池中
        tp.register(this);
    }

    private static Color getColor(){
        return colors[(int)(Math.random()*1000) % colors.length];
    }

    public void changeColor(){
        curColor = getColor();
        repaint();
    }

    public void paint(Graphics g){
        g.setColor(curColor);
        g.fillRect(0,0,getWidth(),getHeight());
    }
}
