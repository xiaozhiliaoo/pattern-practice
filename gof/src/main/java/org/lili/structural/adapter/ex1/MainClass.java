package org.lili.structural.adapter.ex1;

/**
 * Created by lili on 2017/7/12.
 */
public class MainClass {
    public static void main(String[] args) {
        //笔记本18V  电源220V
        Current current = new Current();
        current.use220V();
        //通过继承实现适配器
        Adapter adapter = new Adapter();
        adapter.use18V();
        //通过为组合【Delegate】实现适配器
        Adapter2 adapter2 = new Adapter2(new Current());
        adapter2.use18V();
    }
}
