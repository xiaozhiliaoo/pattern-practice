package org.lili.behavioral.strategy.ex4;

/**
 * Created by lili on 2017/7/8.
 */
public class StrategyExample {
    public static void main(String[] args) {
        Context context;

        // Three contexts following different strategies
        context = new Context(new Add());
        int resultA = context.executeStrategy(3, 4);
        System.out.println("Result A: " + resultA );

        context = new Context(new Subtract());
        int resultB = context.executeStrategy(3, 4);
        System.out.println("Result B: " + resultB );

        context = new Context(new Multiply());
        int resultC = context.executeStrategy(3, 4);
        System.out.println("Result C: " + resultC );
    }
}

