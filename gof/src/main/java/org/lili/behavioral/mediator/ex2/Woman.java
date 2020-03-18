package org.lili.behavioral.mediator.ex2;

/**
 * Created by lili on 2017/7/23
 */
public class Woman extends Person {

    public Woman(String name, int condition, Mediator mediator) {
        super(name, condition, mediator);
    }

    public void getPartner(Person person) {
        this.getMediator().setWoman(this);
        this.getMediator().getPartner(person);
    }
}
