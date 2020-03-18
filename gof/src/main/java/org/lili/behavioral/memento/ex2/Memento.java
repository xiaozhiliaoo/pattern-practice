package org.lili.behavioral.memento.ex2;

/**
 * Created by lili on 2017/7/23
 */
public class Memento {
    private String name;
    private String sex;
    private int age;
    private Box box;

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public Memento(String name, String sex, int age, Box box) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.box = box;

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
