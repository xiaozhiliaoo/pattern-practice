package org.lili.behavioral.command.ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lili on 2017/7/23
 */
public class Waiter2 {
    private List<Command> commands = new ArrayList<Command>();
    //下订单
    public void setOrder(Command command){
        commands.add(command);
    }
    //移除订单
    public void removeOrder(Command command){
        commands.remove(command);
    }

    public void sail(){
        for (Command command : commands) {
            command.sail();
        }
    }
}
