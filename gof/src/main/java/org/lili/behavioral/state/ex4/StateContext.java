package org.lili.behavioral.state.ex4;

/**
 * Created by lili on 2017/7/8.
 */
public class StateContext {

    private StateLike state;

    public StateContext() {
        this.setState(new StateLowerCase());
    }

    public void setState(StateLike state) {
        this.state = state;
    }

    //+request()
    public void writeName(final String name){
        //默认StateLowerCase
        state.writeName(this,name);
    }
}
