package org.lili.structural.flyweight.ex6;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

/**
 * Created by lili on 2017/7/10.
 */
public class FlyweightDemo {
    public static void main(String[] args) {
        Random rn = new Random();
        Frame frame = new Frame("Flyweight Demo");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setLayout(new GridLayout(10, 10));
         // 1. Identify shareable and non-shareable state
        //    shareable - Button label, non-shareable - Button location
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                // 3. The client must use the Factory to request objects  创建15个button对象 其余85个都是共享的
                frame.add(FlyweightFactory.makeButton(Integer.toString(rn.nextInt(15))));
            }
        }
        frame.pack();
        frame.setVisible(true);
        FlyweightFactory.report();
    }
}
