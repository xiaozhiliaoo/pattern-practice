package org.lili.behavioral.chainofresponsibility.ex3;

/**
 * Created by lili on 2017/8/2
 */
public abstract class Logger {
    public static final int ERR = 3;
    public static final int NOTICE = 5;
    public static final int DEBUG = 7;
    private Logger next;
    private int mask;

    public Logger(int mask) {
        this.mask = mask;
    }

    public Logger setNext(Logger l){
        this.next = l;
        return l;
    }

    public void message(String message,int priority){
        if(priority<=mask){
            writeMessage(message);
        }
        if(next!=null){
            next.message(message,priority);
        }
    }

    public abstract void writeMessage(String message);

}
