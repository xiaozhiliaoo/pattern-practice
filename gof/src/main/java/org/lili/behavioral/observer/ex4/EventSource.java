package org.lili.behavioral.observer.ex4;

import java.util.Observable;
import java.util.Scanner;

/**
 * Created by lili on 2017/8/3
 */
public class EventSource extends Observable implements Runnable {
    public void run() {
        while (true) {
            String response = new Scanner(System.in).next();
            this.setChanged();
            notifyObservers(response);
        }
    }
}
