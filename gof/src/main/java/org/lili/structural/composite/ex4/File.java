package org.lili.structural.composite.ex4;

/**
 * Created by lili on 2017/7/13.
 */
public class File implements AbstractFile {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder + name);
    }
}