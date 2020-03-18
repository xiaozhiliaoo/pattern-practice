package org.lili.creational.builder.ex1;

/**
 * Created by lili on 2017/7/16.
 */
public class HouseDirector {

    //建造方法
    public House makeHouse(HouseBuilder builder) {
        builder.makeFloor();
        builder.makeWall();
        builder.makeHouseTop();
        return builder.getHouse();
    }
}
