package org.lili.behavioral.state.ex4;

/**
 * Created by lili on 2017/7/8.
 */
public class StateMultipleUpperCase implements StateLike{

    private int count = 0;

    public void writeName(StateContext context, String name) {

        System.out.println(name.toUpperCase());
        //调用两次后改变状态
        if(++count > 1) {
            context.setState(new StateLowerCase());
        }
    }
}
