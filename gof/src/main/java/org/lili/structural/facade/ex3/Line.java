package org.lili.structural.facade.ex3;

/**
 * Created by lili on 2017/7/11.
 */
public class Line {
    private Point ori,end;

    public Line(Point ori, Point end) {
        this.ori = ori;
        this.end = end;
    }

    public void move(int x, int y){
        ori.move(x,y);
        end.move(x, y);
    }

    public void  rotate(int angle) {
        end.rotate(angle, ori);
    }

    public String toString() {
        return "origin is " + ori + ", end is " + end;
    }

}
