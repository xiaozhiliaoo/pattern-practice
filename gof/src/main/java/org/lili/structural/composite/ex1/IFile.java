package org.lili.structural.composite.ex1;

import java.util.List;

/**
 * Created by lili on 2017/7/12.
 */

/**
 * 文件节点抽象【目录和文件】  Component
 */
public interface IFile {

    //显示文件或者文件夹
    public void display();

    //添加
    public boolean add(IFile file);

    public boolean remove(IFile file);

    //获取子节点
    public List<IFile> getChild();


}
