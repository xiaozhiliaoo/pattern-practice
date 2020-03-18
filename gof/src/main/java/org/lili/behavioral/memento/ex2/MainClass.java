package org.lili.behavioral.memento.ex2;

/**
 * Created by lili on 2017/7/23
 */
public class MainClass {
    public static void main(String[] args) {
        Box b = new Box("food");
        Person per = new Person("lili","boy",13,b);

        //Memento memento = per.createMemento();

        //保存和恢复
        CareTaker taker = new CareTaker();
        taker.setMemento(per.createMemento());


        System.out.println("初始状态：");
        per.display();

        System.out.println("修改状态：");
        per.setName("xiaozhiliao");
        per.setSex("gril");
        b.setSomething("book");
        per.setBox(b);
        per.display();

        System.out.println("还原状态：");
        //Box并没有还原出来
        per.setMemento(taker.getMemento());
        per.display();

    }
}
