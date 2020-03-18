package org.lili.structural.flyweight.ex1;

/**
 * Created by lili on 2017/7/9.
 */

//享元角色
public class MyCharacter {

    private char mychar;

    public MyCharacter(char mychar) {
        this.mychar = mychar;
    }

    public void display(){
        System.out.println(mychar);
    }
}
