package org.lili.behavioral.observer.ex2;

/**
 * Created by lili on 2017/8/3
 */
public class MainClass {
    public static void main(String[] args) {
        BlogUserSubject user = new BlogUserSubject();
        user.addObserver(new MyObserver());
        user.publishBlog("哈哈，博客上线了", "大家多来访问");
    }
}
