package org.lili.creational.abstractfactory.ex2;

/**
 * Created by lili on 2017/7/16.
 */
public interface ICompontFactory {
    public ICompont getButton();
    public ICompont getText();
    public ICompont getComboBox();
}
