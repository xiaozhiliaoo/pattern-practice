package org.lili.behavioral.interpreter.ex1;

/**
 * Created by lili on 2017/7/23
 */
public class MinusExpression extends Expression {
    public void interpret(Context context) {
        //提示信息
        System.out.println("自动递减");
        //获取上下文
        String input = context.getInput();
        //类型转换
        int intInput = Integer.parseInt(input);
        //递增，上下文环境被改变
        --intInput;
        //改变上下文重新赋值，复位，
        context.setInput(String.valueOf(intInput));
        context.setOutput(intInput);
    }
}
