package org.lili.behavioral.chainofresponsibility.ex3;

/**
 * Created by lili on 2017/8/2
 */
public class EmailLogger extends Logger {

    public EmailLogger(int mask) {
        super(mask);
    }

    public void writeMessage(String msg) {
        System.out.println("Sending via email: " + msg);
    }
}