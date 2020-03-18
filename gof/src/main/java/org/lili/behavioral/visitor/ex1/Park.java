package org.lili.behavioral.visitor.ex1;

/**
 * Created by lili on 2017/8/7
 */

//Object Structure
public class Park implements ParkElement {

    private ParkA parkA;
    private ParkB parkB;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Park() {
        this.parkA =new ParkA();
        this.parkA.setName("ParkA");
        this.parkB =new ParkB();
        this.parkB.setName("ParkB");

    }

    public void accept(Visitor visitor) {

        visitor.visit(this);
        parkA.accept(visitor);
        parkB.accept(visitor);

    }
}
