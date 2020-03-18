package org.lili.behavioral.observer.ex4;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by lili on 2017/8/3
 */
public class MyApp {
    public static void main(String[] args) {
        System.out.println("Enter Text:");
        EventSource eventSource = new EventSource();
        eventSource.addObserver(new Observer() {

            @Override
            public String toString() {
                return "Observer1";
            }

            public void update(Observable o, Object arg) {
                System.out.println(this+ " Received response: " + arg);
            }
        });

        eventSource.addObserver(new Observer() {

            @Override
            public String toString() {
                return "Observer2";
            }

            public void update(Observable o, Object arg) {
                System.out.println(this+ " Received response: " + arg);
            }
        });

        new Thread(eventSource).start();
    }
}
