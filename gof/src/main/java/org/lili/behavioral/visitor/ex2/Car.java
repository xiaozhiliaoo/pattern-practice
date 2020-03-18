package org.lili.behavioral.visitor.ex2;

/**
 * Created by lili on 2017/8/7
 */
public class Car implements CarElement {

    CarElement[] elements;

    public Car() {
        this.elements =new CarElement[]{
                new Wheel("front left"),
                new Wheel("front right"),
                new Wheel("back left"),
                new Wheel("back right"),
                new Body(),
                new Engine()
        };
    }

    public void accept(CarElementVisitor visitor) {
        for(CarElement element:elements){
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}
