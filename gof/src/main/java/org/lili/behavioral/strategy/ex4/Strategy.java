package org.lili.behavioral.strategy.ex4;

/**
 * Created by lili on 2017/7/8.
 */
/** The classes that implement a concrete strategy should implement this.
 * The Context class uses this to call the concrete strategy. */
interface Strategy {
    int execute(int a, int b);
}
