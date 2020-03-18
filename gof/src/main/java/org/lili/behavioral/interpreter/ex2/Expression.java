package org.lili.behavioral.interpreter.ex2;

import java.util.*;
/**
 * Created by lili on 2017/7/23
 */
public interface Expression {
    public int interpret(final Map<String, Expression> variables);
}
