package org.lili.creational.builder.ex7;

/**
 * Created by lili on 2017/7/16.
 */
public class Person {
    private String name;
    private int age;

    // Per normal Java style, the setters return void.

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    // Usage:
    public static void main(String[] args) {
        Person person = new Person();
        // Not using chaining; longer than the chained version above.
        // Output: Hello, my name is Peter and I am 21 years old.
        person.setName("Peter");
        person.setAge(21);
        person.introduce();
    }
}