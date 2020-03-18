package org.lili.behavioral.state.ex5;

/**
 * Created by lili on 2017/7/8.
 */
public class DomainObject {
    private String name;

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
