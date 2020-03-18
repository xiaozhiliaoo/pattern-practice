package org.lili.behavioral.state.ex6;

/**
 * Created by lili on 2017/8/5
 */
public class Controller {
    private State currentState;
    private StateMachine machine;
    private CommandChannel commandsChannel;

    public CommandChannel getCommandChannel(){
        return commandsChannel;
    }

    public void handle(String eventCode){
        if(currentState.hasTransition(eventCode)){
            transitionTo(currentState.targetState(eventCode));
        }else if(machine.isResetEvent(eventCode)){
            transitionTo(machine.getStart());
        }
    }

    //状态转换
    private void transitionTo(State target){
        currentState = target;
        currentState.executeActions(commandsChannel);
    }

}
