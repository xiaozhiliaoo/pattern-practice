package org.lili.behavioral.strategy.ex1;

/**
 * Created by lili on 2017/7/8.
 */
public class MainClass {
    public static void main(String[] args) {
        //相当于是多态了
        Strategy md5 = new MD5Strategy();
        md5.encrypt();

        //策略取代了多态  Client关心的是Context  区分装饰模式和策略模式   策略也太简单了。
        Context c = new Context(new MD5Strategy());
        c.encrypt();
    }
}
