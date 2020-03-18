package org.lili.behavioral.mediator.ex3;

/**
 * Created by lili on 2017/7/23
 */
public abstract class Component {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void changed(){
        mediator.componentChange(this);
    }

    public abstract void update();
}
