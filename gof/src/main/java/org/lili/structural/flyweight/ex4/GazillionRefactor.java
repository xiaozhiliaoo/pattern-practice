package org.lili.structural.flyweight.ex4;

/**
 * Created by lili on 2017/7/10.
 */

class Gazillion1 {
    private int row;

    public Gazillion1(int row) {
        this.row = row;
        System.out.println("ctor: " + this.row);
    }

    void report(int col) {
        System.out.print(" " + row + col);
    }
}

class Factory{
    //缓存了row状态。
    private Gazillion1[] pool;

    public Factory(int maxRows) {
        pool = new Gazillion1[maxRows];
    }

    public Gazillion1 getFlyweight(int row){
        if(pool[row] == null){
            pool[row] =  new Gazillion1(row);
        }
        return pool[row];
    }

}


public class GazillionRefactor {

    public static final int ROWS = 6, COLS = 10;


    public static void main(String[] args) {
        Factory factory = new Factory(ROWS);
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                factory.getFlyweight(i).report(j);
            }
            System.out.println();
        }

    }

}
