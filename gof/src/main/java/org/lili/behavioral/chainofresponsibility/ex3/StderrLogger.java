package org.lili.behavioral.chainofresponsibility.ex3;

/**
 * Created by lili on 2017/8/2
 */
public class StderrLogger extends Logger {

    public StderrLogger(int mask) {
        super(mask);
    }

    public void writeMessage(String msg) {
        System.err.println("Sending to stderr: " + msg);
    }
}
