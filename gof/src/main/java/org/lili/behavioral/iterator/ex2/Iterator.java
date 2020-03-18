package org.lili.behavioral.iterator.ex2;

/**
 * Created by lili on 2017/8/4
 */
public interface Iterator {
    public  boolean hasNext();
    //这里为什么不是泛型参数E???
    public Object next();
}
