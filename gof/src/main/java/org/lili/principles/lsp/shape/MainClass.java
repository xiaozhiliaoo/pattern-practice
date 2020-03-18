package org.lili.principles.lsp.shape;

/**
 * Created by lili on 2017/7/8.
 */
public class MainClass {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.setHeight(12);
        r.setWidth(23);
        test(r);
        resize(r);

        //骗过了编译器？但是真的符合里式原则吗? 正方形不是长方形子类，强求继承
        Rectangle square = new Square();
        square.setHeight(10);
        test(square);
        resize(square);

    }

    public static void test(Rectangle r) {
        System.out.println(r.getHeight() + "----" + r.getWidth());
    }

    public static void resize(Rectangle sibianxing) {
        while (sibianxing.getHeight() <= sibianxing.getWidth()) {
            sibianxing.setHeight(sibianxing.getHeight() + 1);
            test(sibianxing);
        }
    }
}
