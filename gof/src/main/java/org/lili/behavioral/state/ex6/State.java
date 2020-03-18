package org.lili.behavioral.state.ex6;

import java.util.*;

/**
 * Created by lili on 2017/8/5
 */
public class State {

    public State(String name) {
        this.name = name;
    }

    private String name;
    private List<Command> actions = new ArrayList<Command>();

    private Map<String,Transiton> transtions = new HashMap<String,Transiton>();

    public void addTranstion(Event event,State targetState){
        assert null!=targetState;
        transtions.put(event.getCode(),new Transiton(this,event,targetState));
    }

    public Collection<State> getAllTargets(){
        List<State> result = new ArrayList<State>();
        for(Transiton t:transtions.values()){
            result.add(t.getTarget());
        }
        return result;
    }

    public boolean hasTransition(String eventCode) {
        return transtions.containsKey(eventCode);
    }

    public State targetState(String eventCode){
        return transtions.get(eventCode).getTarget();
    }

    public void executeActions(CommandChannel commandsChannel){
        for(Command c:actions){
            commandsChannel.send(c.getCode());
        }
    }
}
