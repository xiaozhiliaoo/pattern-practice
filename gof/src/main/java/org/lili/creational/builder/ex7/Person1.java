package org.lili.creational.builder.ex7;

/**
 * Created by lili on 2017/7/16.
 */
public class  Person1 {
    private String name;
    private int age;

    // In addition to having the side-effect of setting the attributes in question,
    // the setters return "this" (the current PersonSubject object) to allow for further chained method calls.

    public Person1 setName(String name) {
        this.name = name;
        return this;
    }

    public Person1 setAge(int age) {
        this.age = age;
        return this;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    // Usage:
    public static void main(String[] args) {
        Person1 person = new Person1();
        // Output: Hello, my name is Peter and I am 21 years old.
        person.setName("Peter").setAge(21).introduce();
    }
}