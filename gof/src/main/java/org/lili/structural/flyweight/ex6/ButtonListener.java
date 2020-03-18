package org.lili.structural.flyweight.ex6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by lili on 2017/7/10.
 */
public class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        Button button  = (Button)e.getSource();
        Component[] buttons = button.getParent().getComponents();
        int i = 0;
        for ( ; i < buttons.length; i++) {
            if (button == buttons[i]) {
                break;
            }
        }
        // 4. A third party must compute the extrinsic state (x and y)
        //    (the Button label is intrinsic state)
        System.out.println("label-" + e.getActionCommand() + "  x-" + i/10   + "  y-" + i%10);
    }
}

