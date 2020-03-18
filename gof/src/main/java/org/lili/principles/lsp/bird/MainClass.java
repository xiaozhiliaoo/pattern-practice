package org.lili.principles.lsp.bird;

/**
 * Created by lili on 2017/7/8.
 */
public class MainClass {

    public static void main(String[] args) {
        fly(new Laoying());
        fly(new Maque());
        //企鹅不能飞~~~
        //fly(new Qier());
        //多态三个条件：1继承  2重写  3 父类引用指向子类
        //能够放父类的地方就能放子类
    }

    //父类
    public static void fly(Brid brid){
        brid.fly();
    }
}
