package org.lili.creational.builder.ex1;

/**
 * Created by lili on 2017/7/16.
 */
public class GongyuBuilder implements HouseBuilder{

    House house = new House();

    //因为是接口，所以必须有getHouse()方法，如果是抽象类，可以提取getHouse()方法
    //到抽象类中，而把makeFloor，makeHouseTop，makeWall做成抽象方法
    public House getHouse() {
        return house;
    }

    public void makeFloor() {
        house.setFloor("公寓-->地板");
    }

    public void makeHouseTop() {
        house.setHousetop("公寓-->房顶");
    }

    public void makeWall() {
        house.setWall("公寓-->墙");
    }
}


