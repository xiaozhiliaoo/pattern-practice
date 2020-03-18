package org.lili.behavioral.mediator.ex3;

/**
 * Created by lili on 2017/7/23
 */
public class ConcreteMediator extends Mediator {

    private Button addButton;
    private List list;
    private TextBox userNameTextBox;
    private ComboBox cb;

    public void setAddButton(Button addButton) {
        this.addButton = addButton;
    }

    public void setList(List list) {
        this.list = list;
    }

    public void setUserNameTextBox(TextBox userNameTextBox) {
        this.userNameTextBox = userNameTextBox;
    }

    public void setCb(ComboBox cb) {
        this.cb = cb;
    }

    public void componentChange(Component c) {
        if(c == addButton){
            System.out.println("单击按钮");
            list.update();
            cb.update();
            userNameTextBox.update();
        }else if(c == list){
            System.out.println("列表框选择客户");
            cb.select();
            userNameTextBox.setText();
        }else if(c == cb){
            System.out.println("组合框选择客户");
            cb.select();
            userNameTextBox.setText();
        }
    }
}
