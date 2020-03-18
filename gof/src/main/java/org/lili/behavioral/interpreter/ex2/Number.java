package org.lili.behavioral.interpreter.ex2;

import java.util.Map;

/**
 * Created by lili on 2017/7/23
 */
public class Number implements Expression {
    private int number;
    public Number(final int number){
        this.number = number;
    }

    public int interpret(Map<String, Expression> variables) {
        return number;
    }
}
