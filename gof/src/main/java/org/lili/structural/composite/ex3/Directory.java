package org.lili.structural.composite.ex3;

import java.util.ArrayList;

/**
 * Created by lili on 2017/7/13.
 */
public class Directory {
    private String name;
    private ArrayList includedFiles = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    public void add(Object obj){
        includedFiles.add(obj);
    }


    public void ls(){
        System.out.println(CompositeDemo.compositeBuilder+name);
        CompositeDemo.compositeBuilder.append("   ");
        for(Object obj:includedFiles){
            //类名写死的
            String name = obj.getClass().getSimpleName();
            if(name.equals("Directory")){
                //递归
                ((Directory)obj).ls();
            }else{
                ((File)obj).ls();
            }
        }
        CompositeDemo.compositeBuilder.setLength(CompositeDemo.compositeBuilder.length() - 3);
    }
}
