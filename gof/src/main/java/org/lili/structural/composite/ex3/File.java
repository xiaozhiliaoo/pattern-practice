package org.lili.structural.composite.ex3;

/**
 * Created by lili on 2017/7/13.
 */
public class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void ls(){
        System.out.println(CompositeDemo.compositeBuilder +name);
    }


}
