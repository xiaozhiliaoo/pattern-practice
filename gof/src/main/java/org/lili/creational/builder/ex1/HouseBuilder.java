package org.lili.creational.builder.ex1;

/**
 * Created by lili on 2017/7/16.
 */

//可以是接口，也可以是抽象类
public interface HouseBuilder {

    public void makeFloor();

    public void makeWall();

    public void makeHouseTop();

    public House getHouse();
}
