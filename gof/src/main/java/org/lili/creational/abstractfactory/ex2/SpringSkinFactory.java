package org.lili.creational.abstractfactory.ex2;

/**
 * Created by lili on 2017/7/16.
 */
public class SpringSkinFactory implements ICompontFactory{
    public ICompont getButton() {
        return new SpringButton();
    }

    public ICompont getText() {
        return new SpringText();
    }

    public ICompont getComboBox() {
        return new SpringComboBox();
    }
}
