package org.lili.behavioral.visitor.ex1;

/**
 * Created by lili on 2017/8/7
 */

/**
 * 公园每一部分抽象
 */
public interface ParkElement {
    //用来接纳Visitor
    public void accept(Visitor visitor);
}
