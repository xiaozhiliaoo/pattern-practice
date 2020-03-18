package org.lili.behavioral.memento.ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lili on 2017/7/23
 */
public class MainClass {
    public static void main(String[] args) {
        List<Originator.Memento> savedStates = new ArrayList<Originator.Memento>();
        Originator originator = new Originator();
        originator.setState("State1");
        originator.setState("State2");
        savedStates.add(originator.saveToMemento());
        originator.setState("State3");
        // We can request multiple mementos, and choose which one to roll back to.
        savedStates.add(originator.saveToMemento());
        originator.setState("State4");
        originator.restoreFromMemento(savedStates.get(0));
        originator.restoreFromMemento(savedStates.get(1));
//        originator.restoreFromMemento(savedStates.get(2));
    }
}
