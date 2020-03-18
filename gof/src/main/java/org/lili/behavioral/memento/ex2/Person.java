package org.lili.behavioral.memento.ex2;

/**
 * Created by lili on 2017/7/23
 */



public class Person {
    private Box box;
    private String name;
    private String sex;
    private int age;

    public Person() {
    }

    public void display(){
        System.out.println("name:"+name);
        System.out.println("sex:"+sex);
        System.out.println("age:"+age);
        System.out.println("box"+box);
    }

    public Person(String name, String sex, int age,Box box) {
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

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    //createMemento是Person类的职责    职责就是方法和属性
    //备份  有点像原型模式
    public Memento createMemento(){
        return new Memento(name,sex,age,box);
    }

    //还原
    public void setMemento(Memento memento){
        this.name = memento.getName();
        this.sex = memento.getSex();
        this.age = memento.getAge();
        this.box = memento.getBox();
    }
}
