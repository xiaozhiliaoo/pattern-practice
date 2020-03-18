package org.lili.structural.facade.ex3;

/**
 * Created by lili on 2017/7/11.
 */
public class PointPolar {

    private double radius, angle;

    public PointPolar(double radius, double angle) {
        this.radius = radius;
        this.angle = angle;
    }

    public void  rotate(int angle) {
        this.angle += angle % 360;
    }

    public String toString() {
        return "[" + radius + "@" + angle + "]";
    }
}
