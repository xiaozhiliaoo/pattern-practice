package org.lili.behavioral.interpreter.ex2;

import java.util.*;

/**
 * Created by lili on 2017/7/23
 */
public class Minus implements Expression{
    Expression leftOperand;
    Expression rightOperand;
    public Minus(final Expression left, final Expression right) {
        leftOperand = left;
        rightOperand = right;
    }

    public int interpret(final Map<String, Expression> variables) {
        return leftOperand.interpret(variables) - rightOperand.interpret(variables);
    }
}
