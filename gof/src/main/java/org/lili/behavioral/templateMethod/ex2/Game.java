package org.lili.behavioral.templateMethod.ex2;

/**
 * Created by lili on 2017/7/8.
 */
public abstract class Game {
    protected int playersCount;
    abstract void initializeGame();
    abstract void makePlay(int player);
    abstract boolean endOfGame();
    abstract void printWinner();

    public void playOneGame(int playersCount){
        this.playersCount = playersCount;
        initializeGame();
        int j = 0;
        while(!endOfGame()){
            makePlay(j);
            j = (j+1)%playersCount;
            printWinner();
        }
    }
}
