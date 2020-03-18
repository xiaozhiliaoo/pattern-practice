package org.lili.structural.composite.ex1;

import java.util.List;

/**
 * Created by lili on 2017/7/12.
 */
//Leaf  文件  叶节点  没有子节点了
public class File implements IFile {

    private String name;

    public File(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name);
    }

    public boolean add(IFile file) {
        return false;
    }

    public boolean remove(IFile file) {
        return false;
    }

    public List<IFile> getChild() {
        return null;
    }
}
