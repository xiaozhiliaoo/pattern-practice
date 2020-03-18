package org.lili.behavioral.interpreter.ex2;

import java.util.Map;

/**
 * Created by lili on 2017/7/23
 */
public class Variable implements Expression {

    private String name;

    public Variable(final String name) {
        this.name = name;
    }

    public int interpret(Map<String, Expression> variables) {
        if(null == variables.get(name)){
            return 0;
        }
        return variables.get(name).interpret(variables);
    }
}
