package org.lili.behavioral.memento.ex1;

import org.lili.behavioral.memento.ex2.Memento;

/**
 * Created by lili on 2017/7/23
 */
public class Person {
    private String name;
    private String sex;
    private int age;

    public Person() {
    }

    public void display(){
        System.out.println("name:"+name);
        System.out.println("sex:"+sex);
        System.out.println("age:"+age);
    }

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
