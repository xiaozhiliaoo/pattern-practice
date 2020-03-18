package org.lili.behavioral.observer.ex5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by lili on 2017/8/3
 */
//观察者，
public class DisplayForm extends JFrame{

    InputFormObserver input = new InputFormObserver();

    InputForm inputForm;

    Observable obsInput;

    JTextField display;

    public DisplayForm() {

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        inputForm = new InputForm();
        obsInput = inputForm.getInputInfo();
        obsInput.addObserver(input);

        display = new JTextField(10);
        display.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        getContentPane().add(display);
        setTitle("Observer form");
        setSize(500, 500);
        setLocation(700, 100);
        setVisible(true);
    }

    private class InputFormObserver implements Observer {

        public void update(Observable o, Object arg) {
            doSomeUpdate();
            if (obsInput.countObservers() > 0) {
                obsInput.deleteObservers();
            }
            obsInput = inputForm.getInputInfo();
            obsInput.addObserver(input);
        }

        public void doSomeUpdate() {
            display.setText(inputForm.getText());
            JOptionPane.showMessageDialog(DisplayForm.this, "This form has been updated");
        }
    }

    public static void main(String args[]) {
        DisplayForm df = new DisplayForm();
//        DisplayForm df2 = new DisplayForm();
    }
}
