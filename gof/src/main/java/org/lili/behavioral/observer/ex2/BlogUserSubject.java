package org.lili.behavioral.observer.ex2;

import java.util.Observable;

/**
 * Created by lili on 2017/8/3
 */
//BlogUserSubject 被观察者
public class BlogUserSubject extends Observable {

    public void publishBlog(String title, String content){
        Article art = new Article();
        art.setContent(content);
        art.setTitle(title);
        System.out.println("lili发表新文章,标题："+title+"----"+"内容"+content);
        this.setChanged();
        this.notifyObservers(art);
    }
}
