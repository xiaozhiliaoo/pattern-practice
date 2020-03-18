package org.lili.behavioral.chainofresponsibility.ex3;

/**
 * Created by lili on 2017/8/2
 */
public class ChainOfResponsibilityExample {
    public static void main(String[] args) {
        // Build the chain of responsibility
        Logger l,l1;
        l1 = l = new StdoutLogger(Logger.DEBUG);
        l1 = l1.setNext(new EmailLogger(Logger.NOTICE));
        l1 = l1.setNext(new StderrLogger(Logger.ERR));

        // Handled by StdoutLogger
//        l.message("Entering function y.", Logger.DEBUG);

        // Handled by StdoutLogger and EmailLogger
//        l.message("Step completed.", Logger.NOTICE);

        // Handled by all three loggers 随机的？？？
        l.message("An error has occurred.", Logger.ERR);
    }
}
