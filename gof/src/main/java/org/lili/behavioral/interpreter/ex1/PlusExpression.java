package org.lili.behavioral.interpreter.ex1;

/**
 * Created by lili on 2017/7/23
 */
public class PlusExpression extends Expression {

    public void interpret(Context context) {
        //提示信息
        System.out.println("自动递增");
        //获取上下文
        String input = context.getInput();
        //类型转换
        int intInput = Integer.parseInt(input);
        //递增，上下文环境被改变
        ++intInput;
        //改变上下文重新赋值，复位，必须重新设置环境类
        context.setInput(String.valueOf(intInput));
        context.setOutput(intInput);
    }
}
