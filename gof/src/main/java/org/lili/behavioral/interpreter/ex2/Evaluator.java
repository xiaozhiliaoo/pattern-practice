package org.lili.behavioral.interpreter.ex2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by lili on 2017/7/23
 */
public class Evaluator implements Expression {

    private Expression syntaxTree;

    public Evaluator(final String expression) {
        final Stack<Expression> expressionStack = new Stack<Expression>();
        for(final String token:expression.split(" ")){
            if(token.equals("+")){
                final Expression subExpression = new Plus(expressionStack.pop(),expressionStack.pop());
                expressionStack.push(subExpression);
            }else if(token.equals("-")){
                final Expression right = expressionStack.pop();
                final Expression left = expressionStack.pop();
                final Expression subExpression = new Minus(left, right);
                expressionStack.push(subExpression);
            }else{
                expressionStack.push(new Variable(token));
            }
        }
        syntaxTree = expressionStack.pop();
    }

    public int interpret(Map<String, Expression> variables) {
        return syntaxTree.interpret(variables);
    }

    public static void main(String[] args) {
        final String exp = "w x z - +";
        final Evaluator sentence  = new Evaluator(exp);
        final Map<String,Expression> variables = new HashMap<String, Expression>();
        variables.put("w",new Number(5));
        variables.put("x", new Number(10));
        variables.put("z", new Number(42));
        final int result = sentence.interpret(variables);
        System.out.println(result);
    }
}
