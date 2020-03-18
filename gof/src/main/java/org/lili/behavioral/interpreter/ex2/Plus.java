package org.lili.behavioral.interpreter.ex2;

import java.util.Map;

/**
 * Created by lili on 2017/7/23
 */
public class Plus implements Expression {
    Expression leftOperand;
    Expression rightOperand;

    public Plus(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public int interpret(Map<String, Expression> variables) {
        return leftOperand.interpret(variables) + rightOperand.interpret(variables);
    }
}
