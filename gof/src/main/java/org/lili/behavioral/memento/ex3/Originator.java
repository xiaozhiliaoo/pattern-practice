package org.lili.behavioral.memento.ex3;

/**
 * Created by lili on 2017/7/23
 */
public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.println("Originator: Setting state to " + state);

    }

    //do to save
    public Memento saveToMemento(){
        System.out.println("Originator: Saving to Memento.");
        return new Memento(this.state);
    }

    //undo
    public void restoreFromMemento(Memento memento){
        this.state = memento.getSavedState();
        System.out.println("Originator: State after restoring from Memento: " + state);
    }

    //内部类来实现
    public static class Memento{
        private final String state;

        public Memento(String state) {
            this.state = state;
        }

        private String getSavedState(){
            return state;
        }
    }
}
