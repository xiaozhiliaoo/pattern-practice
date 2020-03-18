package org.lili.behavioral.mediator.ex3;

/**
 * Created by lili on 2017/7/23
 */
public class MainClass {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        Button button = new Button();
        List list = new List();
        ComboBox comboBox = new ComboBox();
        TextBox textBox = new TextBox();

        button.setMediator(mediator);
        list.setMediator(mediator);
        comboBox.setMediator(mediator);
        textBox.setMediator(mediator);

        mediator.setAddButton(button);
        mediator.setList(list);
        mediator.setCb(comboBox);
        mediator.setUserNameTextBox(textBox);

        button.changed();
        list.changed();
    }
}
