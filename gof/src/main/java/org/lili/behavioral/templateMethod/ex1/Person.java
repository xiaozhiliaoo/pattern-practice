package org.lili.behavioral.templateMethod.ex1;

/**
 * Created by lili on 2017/7/8.
 */
public  abstract  class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void say(){
        System.out.println(this.name+"--"+this.age);
    }
}
