package org.lili.behavioral.state.ex4;

/**
 * Created by lili on 2017/7/8.
 */
public class StateLowerCase implements StateLike {
    public void writeName(StateContext context, String name) {
        System.out.println(name.toLowerCase());
        context.setState(new StateMultipleUpperCase());
    }
}
