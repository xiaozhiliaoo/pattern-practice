package org.lili.behavioral.mediator.ex2;

/**
 * Created by lili on 2017/7/23
 */
public class Man extends Person {


    public Man(String name, int condition, Mediator mediator) {
        super(name, condition, mediator);
    }

    public void getPartner(Person person) {
        this.getMediator().setMan(this);
        this.getMediator().getPartner(person);
    }
}
