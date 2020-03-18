package org.lili.principles.lsp;

/**
 * Created by lili on 2017/7/8.
 */
public class MainClass {

    public static void main(String[] args) {
        Person p = new Person();
        display(p);
        //display2(p);
        /*display2
                (org.lili.principles.lsp.Man)
        in MainClass cannot be applied
                to
        (org.lili.principles.lsp.PersonSubject)*/

        Man m = new Man();
        display(m);
        display2(m);
    }

    public static void display(Person person){
        person.display();
    }

    public static void display2(Man m){
        m.display();
    }
}
