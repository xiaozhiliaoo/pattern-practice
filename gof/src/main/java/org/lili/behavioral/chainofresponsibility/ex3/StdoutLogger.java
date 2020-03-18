package org.lili.behavioral.chainofresponsibility.ex3;

/**
 * Created by lili on 2017/8/2
 */
public class StdoutLogger extends Logger {

    public StdoutLogger(int mask) {
        super(mask);
    }

    public void writeMessage(String message) {
        System.out.println("Writing to stdout: " + message);
    }
}
