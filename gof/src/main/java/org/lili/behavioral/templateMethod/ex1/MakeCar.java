package org.lili.behavioral.templateMethod.ex1;

/**
 * Created by lili on 2017/7/8.
 */

/**
 * 算法
 * 加密解密
 * 试卷，日程表。
 * 问题是重复的，但是具体答案是不同的。问题步骤体现在模板方法里面。
 */
public abstract class MakeCar {

    public abstract void makeHead();

    public abstract void makeBody();

    public abstract void makeTail();

    public void start(){
        System.out.println("start.....");
    }

    public void end(){
        System.out.println("end......");
    }

    /*public void interrupt(){
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("interuter for a while......");
    }*/

    //模板方法  定义的是步骤   细节不同，步骤相同
    //模板方法关注步骤，抽象方法关注细节，不同子类进行不同的细节实现
    //模板方法仅仅比抽象类多了一个模板方法
    //a "hook" method
    public void build(){
        //具体方法
        this.start();
        //抽象方法
        this.makeHead();
        this.makeBody();
        this.makeTail();
        this.end();
    }
}
