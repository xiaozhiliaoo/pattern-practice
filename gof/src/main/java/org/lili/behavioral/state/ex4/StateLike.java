package org.lili.behavioral.state.ex4;

/**
 * Created by lili on 2017/7/8.
 */

//Using a State Design Pattern over Switch and If statements
// and over State Machines is a powerful tool that can make
// your life easier and save your employer time & money.
// It’s that simple.
public interface StateLike {
    void writeName(StateContext context,String name);
}
