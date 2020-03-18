package org.lili.principles.lsp.quadrilateral;


/**
 * Created by lili on 2017/7/8.
 */
public class MainClass {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.setHeight(12);
        r.setWidth(23);
        test(r);

        //骗过了编译器？但是真的符合里式原则吗? 正方形不是长方形子类，强求继承
        //编译器找不出是不是真的符合了里式替换原则的。
        Square square = new Square();
        square.setHeight(10);
        test(square);
    }

    public static void test(Quadrilateral q) {
        System.out.println(q.getHeight() + "----" + q.getWidth());
    }

}
