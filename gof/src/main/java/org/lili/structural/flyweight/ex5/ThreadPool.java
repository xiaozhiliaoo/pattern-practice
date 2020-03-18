package org.lili.structural.flyweight.ex5;

import java.util.Vector;

/**
 * Created by lili on 2017/7/10.
 */
public class ThreadPool {

    private Vector boxes = new Vector();
    private int pause;

    class HandlerThread extends Thread{

        @Override
        public void run() {
            while(true){
                //8个线程随机改变颜色
                ((ColorBox)boxes.elementAt((int)(Math.random()*1000%boxes.size()))).changeColor();
                try {
                    Thread.sleep(pause);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public ThreadPool(int pause) {
        this.pause = pause;
    }

    public void register(ColorBox r){
        boxes.addElement(r);
    }

    public void start(){
        // int NUM_THREADS = 8;
        int NUM_THREADS = Runtime.getRuntime().availableProcessors();//8
        for (int i = 0; i < NUM_THREADS; i++) {
            new HandlerThread().start();
        }
    }
}
