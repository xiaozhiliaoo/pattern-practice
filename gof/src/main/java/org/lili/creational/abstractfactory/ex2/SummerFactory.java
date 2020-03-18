package org.lili.creational.abstractfactory.ex2;

/**
 * Created by lili on 2017/7/16
 */
public class SummerFactory implements ICompontFactory {
    public ICompont getButton() {
        return new SummerButton();
    }

    public ICompont getText() {
        return new SummerText();
    }

    public ICompont getComboBox() {
        return new SummerComboBox();
    }
}
