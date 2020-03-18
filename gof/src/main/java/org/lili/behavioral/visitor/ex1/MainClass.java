package org.lili.behavioral.visitor.ex1;

/**
 * Created by lili on 2017/8/7
 */
public class MainClass {
    public static void main(String[] args) {

        Park park = new Park();
        park.setName("美丽公园");
        System.out.println("Visitor Start Working....");
        VisitorA visitorA = new VisitorA();
        VisitorB visitorB = new VisitorB();
        park.accept(visitorA);
        park.accept(visitorB);

        System.out.println("VisitorManager Start Working....");
        VisitorManager vm = new VisitorManager();
        park.accept(vm);
    }
}
