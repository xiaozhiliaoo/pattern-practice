package org.lili.behavioral.state.ex6;

/**
 * Created by lili on 2017/8/5
 */
public class Transiton {
    private final State source,target;
    private Event trigger;

    public Transiton(State source, Event trigger,State target) {
        this.source = source;
        this.target = target;
        this.trigger = trigger;
    }

    public State getSource() {
        return source;
    }

    public State getTarget() {
        return target;
    }

    public Event getTrigger() {
        return trigger;
    }

    public String getEventCode(){
        return trigger.getCode();
    }
}
