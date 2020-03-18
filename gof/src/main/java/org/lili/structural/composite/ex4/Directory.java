package org.lili.structural.composite.ex4;

import java.util.ArrayList;

/**
 * Created by lili on 2017/7/13.
 */
public class Directory implements AbstractFile {

    private String name;
    private ArrayList includedFiles = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    public void add(Object obj){
        includedFiles.add(obj);
    }

    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder + name);
        CompositeDemo.compositeBuilder.append("   ");
        for(Object includeFile:includedFiles){
            AbstractFile obj = (AbstractFile) includeFile;
            obj.ls();
        }
        CompositeDemo.compositeBuilder.setLength(CompositeDemo.compositeBuilder.length() - 3);
    }
}
