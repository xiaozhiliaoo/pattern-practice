package org.lili.creational.abstractfactory.ex2;

/**
 * Created by lili on 2017/7/16
 */
public class MainClass {
    public static void main(String[] args) {
        SpringSkinFactory springSkinFactory = new SpringSkinFactory();
        springSkinFactory.getButton().display();
        springSkinFactory.getComboBox().display();
        springSkinFactory.getText().display();
    }
}
