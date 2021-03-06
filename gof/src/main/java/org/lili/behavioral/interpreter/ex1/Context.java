package org.lili.behavioral.interpreter.ex1;

/**
 * Created by lili on 2017/7/23
 */

/**
 * 上下文环境，用于保存文法
 */
public class Context {
    private String input;
    private int output;

    public Context(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }
}
