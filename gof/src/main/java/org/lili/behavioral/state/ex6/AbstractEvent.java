package org.lili.behavioral.state.ex6;

/**
 * Created by lili on 2017/8/5
 */
public class AbstractEvent {
    private String name;
    private String code;

    public AbstractEvent(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
