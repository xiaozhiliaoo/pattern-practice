package org.lili.behavioral.chainofresponsibility.ex6;

import java.util.Random;

/**
 * Created by lili on 2017/8/5
 */
public class Enums {
    private static Random rand = new Random(47);
    public static <T extends Enum<T>> T random(Class<T> ec){
        return random(ec.getEnumConstants());
    }

    public static <T> T random(T[] values){
        return values[rand.nextInt(values.length)];
    }
}
