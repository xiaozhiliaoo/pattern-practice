package org.lili.behavioral.state.ex4;

/**
 * Created by lili on 2017/7/8.
 */
public class DemoOfClientState {
    public static void main(String[] args) {
        final StateContext sc = new StateContext();
        //Allow an object to alter its behaviour when its internal state changes.
        // The object will appear to change its class.
        sc.writeName("Monday");
        sc.writeName("Tuesday");
        sc.writeName("Wednesday");
        sc.writeName("Thursday");
        sc.writeName("Friday");
        sc.writeName("Saturday");
        sc.writeName("Sunday");
    }
}
