package org.lili.behavioral.observer.ex5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;

/**
 * Created by lili on 2017/8/3
 */
//Subject  被观察者 ，主题
public class InputForm extends JFrame {

    //Private Class
    public InformDisplay inform = new InformDisplay();

    JTextField input = new JTextField(20);

    public InputForm() {
        JPanel panel= new JPanel();
        input.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inform.notifyObservers();
            }
        });
        panel.add(new JLabel("Enter: "));
        panel.add(input);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }});
        getContentPane().add(panel);
        setTitle("Observable form");
        setSize(500,500);
        setVisible(true);
    }

    public Observable getInputInfo() {
        return inform;
    }

    public String getText() {
        return input.getText();
    }

    private class InformDisplay extends Observable {
        public void notifyObservers() {
            setChanged();
            super.notifyObservers();
        }
        public String getChange() {
            return input.getText();
        }
    }
    //...
}
