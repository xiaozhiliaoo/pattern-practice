package org.lili.principles.dip;

/**
 * Created by lili on 2017/7/8.
 */
public class MainClass {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setMainBoard(new HuaShuoMainBoard());
        computer.setMemory(new JinShiDunMemory());
        computer.setHarddisk(new XiJieHardDisk());

        computer.display();

        System.out.println("-------------");

        computer.setMainBoard(new WeiXingMainBoard());
        computer.display();
    }
}
