package org.lili.behavioral.observer.ex3;

import java.util.Vector;

/**
 * Created by lili on 2017/8/3
 */
//JDK源码Observable
public class MyObservable {
    private boolean changed = false;
    private Vector<MyObserver> obs;

    public MyObservable() {
        this.obs = new Vector<MyObserver>();
    }

    public synchronized void addObserver(MyObserver o){
        if(o==null){
            throw new NullPointerException();
        }

        if(!obs.contains(o)){
            obs.add(o);
        }
    }

    public synchronized void deleteObserver(MyObserver o){
        obs.removeElement(o);
    }

    public void notifyObservers(){
        notifyObservers(null);
    }

    public void notifyObservers(Object arg) {
        Object[] arrLocal;
        synchronized (this) {
            if(!changed){
                return;
            }
            arrLocal = obs.toArray();
            clearChanged();
        }
        //后来的先监听到消息的改变
        for (int i = arrLocal.length-1; i >= 0; i--) {
            ((MyObserver)(arrLocal[i])).update(this,arg);
        }
        /*for (int i = 0; i < arrLocal.length-1; i++) {
            ((MyObserver)(arrLocal[i])).update(this,arg);
        }*/
    }

    protected synchronized void clearChanged() {
        changed = false;
    }

    public synchronized  void setChanged(){
        changed = true;
    }

    public synchronized boolean hasChanged(){
        return changed;
    }

    public synchronized int countObservers(){
        return obs.size();
    }


}
