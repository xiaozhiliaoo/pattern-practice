package org.lili.behavioral.iterator.ex2;

/**
 * Created by lili on 2017/8/4
 */
public class MainClass {
    public static void main(String[] args) {
        NameRepository n = new NameRepository();
        Iterator iterator = n.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
