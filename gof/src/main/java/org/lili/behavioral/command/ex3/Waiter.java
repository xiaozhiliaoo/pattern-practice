package org.lili.behavioral.command.ex3;

/**
 * Created by lili on 2017/7/23
 * Invoke
 */
public class Waiter {
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public Waiter(Command command) {
        this.command = command;
    }

    public void sail(){
        command.sail();
    }
}
