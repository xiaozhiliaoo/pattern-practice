package org.lili.structural.adapter.ex1;

/**
 * Created by lili on 2017/7/12.
 */

/**
 * Adapter
 * 电流被替换了330V  直接改适配器  不用改Client源代码
 * 定义了新的接口  对旧的功能进行抽象     Adapter extends Adaptee
 * Client调用组件 组件不是很成熟   以后可能替换  1 直接调用  2  适配器
 */
public class Adapter extends Current{

    public void use18V(){
        System.out.println("使用适配器...电源转换");
        super.use220V();
    }
}
