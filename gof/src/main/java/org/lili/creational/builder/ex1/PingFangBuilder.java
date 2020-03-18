package org.lili.creational.builder.ex1;

/**
 * Created by lili on 2017/7/16.
 */
public class PingFangBuilder implements HouseBuilder {

    private House house = new House();

    public void makeFloor() {
        house.setFloor("平房-->地板");
    }

    public void makeWall() {
        house.setHousetop("平房-->房顶");
    }

    public void makeHouseTop() {
        house.setWall("平房-->墙");
    }

    public House getHouse(){
        return house;
    }
}
