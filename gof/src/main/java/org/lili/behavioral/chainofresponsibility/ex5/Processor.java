package org.lili.behavioral.chainofresponsibility.ex5;

import java.util.Random;

/**
 * Created by lili on 2017/8/2
 */
public class Processor {
    private static final Random RANDOM = new Random();
    private static int nextID = 1;
    private int id = nextID++;
    public boolean execute(Image image){
        if (RANDOM.nextInt(2) != 0) {
            System.out.println("   Processor " + id + " is busy");
            return false;
        }
        System.out.println("Processor " + id + " - " + image.process());
        return true;
    }

}
