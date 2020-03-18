package org.lili.behavioral.mediator.ex2;



/**
 * Created by lili on 2017/7/23
 */
public class MainClass {

    public static void main(String[] args) {
        //两个类互相调用对方方法。存在了交互行为
        Mediator m = new Mediator();
        Person lili = new Man("lili",6,m);
        Person lisi = new Man("李四",5,m);
        Person xiaofang = new Woman("小芳",6,m);
        lili.getPartner(xiaofang);
        lisi.getPartner(xiaofang);
        lili.getPartner(lisi);
    }
}
