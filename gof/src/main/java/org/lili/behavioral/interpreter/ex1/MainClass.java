package org.lili.behavioral.interpreter.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lili on 2017/7/23
 */
public class MainClass {
    public static void main(String[] args) {
        String num = "10";
        Context context = new Context(num);
        //递增解释器对10进行递增
        /*Expression epplus = new PlusExpression();
        epplus.interpret(context);
        epplus.interpret(context);

        System.out.println(context.getOutput());
        //递减解释器
        Expression minplus = new MinusExpression();
        minplus.interpret(context);
        minplus.interpret(context);
        System.out.println(context.getOutput());*/


        List<Expression> expres = new ArrayList<Expression>();
        expres.add(new PlusExpression());
        expres.add(new PlusExpression());
        expres.add(new MinusExpression());
        expres.add(new PlusExpression());
        expres.add(new PlusExpression());
        expres.add(new PlusExpression());
        for (Expression expre : expres) {
            expre.interpret(context);
            System.out.println(context.getOutput());
        }
    }
}
