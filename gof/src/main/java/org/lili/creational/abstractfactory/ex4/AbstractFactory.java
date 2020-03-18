package org.lili.creational.abstractfactory.ex4;

/**
 * Created by lili on 2017/7/16
 */
public abstract class AbstractFactory {
    public Expression prototype;
    //原型和抽象工厂结合
    public Expression makePhase(){
        return prototype.clone();
    }

    public abstract Expression makeCompromise();
    public abstract Expression makeGrade();
}
