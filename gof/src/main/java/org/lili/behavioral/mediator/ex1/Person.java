package org.lili.behavioral.mediator.ex1;

/**
 * Created by lili on 2017/7/23
 */
public abstract class Person {
    private String name;
    private int condition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public Person(String name, int condition) {
        this.name = name;
        this.condition = condition;
    }

    public abstract void getPartner(Person person);
}
