package org.lili.creational.abstractfactory.ex4;

/**
 * Created by lili on 2017/7/16
 */
public class PCFactory extends AbstractFactory {

    public PCFactory() {
        prototype = new PCPhase();
    }

    public Expression makeCompromise() {
        return new Expression("\"do it your way, any way, or no way\"");
    }

    public Expression makeGrade() {
        return new Expression("\"you pass, self-esteem intact\"");
    }
}
