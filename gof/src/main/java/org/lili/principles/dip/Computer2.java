package org.lili.principles.dip;

/**
 * Created by lili on 2017/7/8.
 */

/**
 * Computer2高层依赖于底层具体实现，而不是依赖于抽象，Computer直接和抽象打交道。里式替换也体现了。
 * 抽象依赖于细节了。非面向接口编程。
 */
public class Computer2 {

    //1  高层模块依赖于底层    抽象依赖于细节，可以看见细节层，HuaShuoMainBoard但是看不见抽象层
    //通过增加抽象层，高级别和低级别都可以从上到下减少传统依赖关系，反转并不意味着低级别层次取决于高级别
    //层次，这两层都依赖于抽象层。
    //在传统应用架构中，较低级别组件被较高级别组件使用，可以构建很复杂的系统。对低级别的组件依赖导致了
    //更高级别组件被重用的机会。如果换成MainBoard，Memory，HardDisk将会提高Computer2的重用性。
    //依赖反转原则是指抽象不应该依赖于细节，细节应该依赖于抽象，即应针对接口编程，而不是针对实现编程。
    //抽象不是指的Abstract or Interface，而是抽象一个组件的概念。抽象一个模块，不应该用具体实现去
    //抽象，而是抽象，然后实现。
    private HuaShuoMainBoard mainBoard;
    private JinShiDunMemory memory;
    private XiJieHardDisk hardDisk;

    public HuaShuoMainBoard getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(HuaShuoMainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }

    public JinShiDunMemory getMemory() {
        return memory;
    }

    public void setMemory(JinShiDunMemory memory) {
        this.memory = memory;
    }

    public XiJieHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(XiJieHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void display(){
        mainBoard.doSomething();
        hardDisk.doSomething();
        memory.doSomething();
    }
}
