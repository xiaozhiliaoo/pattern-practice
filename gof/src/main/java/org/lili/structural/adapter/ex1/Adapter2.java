package org.lili.structural.adapter.ex1;

/**
 * Created by lili on 2017/7/12.
 */
public class Adapter2 {
    private Current current;

    public Adapter2(Current current) {
        this.current = current;
    }

    public void use18V(){
        System.out.println("使用适配器2...电源转换");
        current.use220V();
    }
}
