package org.lili.creational.abstractfactory.ex4;

/**
 * Created by lili on 2017/7/16
 */
public class NotPCFactory extends AbstractFactory {

    public NotPCFactory() {
        prototype = new NotPCPhase();
    }

    public Expression makeCompromise() {
        return new Expression("\"my way, or the highway\"");    }

    public Expression makeGrade() {
        return new Expression("\"take test, deal with the results\"");
    }
}
