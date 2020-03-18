package org.lili.principles.dip;

/**
 * Created by lili on 2017/7/8.
 */
public class Computer {


    //抽象不应该依赖于细节，细节应该依赖于抽象。
    //高层依赖于底层  细节依赖于抽象。   Computer是一个抽象组件，并没有依赖于具体实现，而具体实现依赖于抽象

    private MainBoard mainBoard;
    private Memory memory;
    private HardDisk harddisk;


    public MainBoard getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(MainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDisk getHarddisk() {
        return harddisk;
    }

    public void setHarddisk(HardDisk harddisk) {
        this.harddisk = harddisk;
    }

    public void display() {
        mainBoard.doSomething();
        memory.doSomething();
        harddisk.doSomething();
    }
}
