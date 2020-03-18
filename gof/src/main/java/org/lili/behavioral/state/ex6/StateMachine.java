package org.lili.behavioral.state.ex6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by lili on 2017/8/5
 */
public class StateMachine {
    private State start;

    public State getStart() {
        return start;
    }

    public StateMachine(State start) {
        this.start = start;
    }

    public Collection<State> getStates(){
        List<State> result = new ArrayList<State>();
        collectStates(result,start);
        return result;
    }

    private void collectStates(Collection<State> result,State s){
        if(result.contains(s)){
            return;
        }
        result.add(s);
        for(State next:s.getAllTargets()){
            collectStates(result,next);
        }
    }

    private List<Event> resetEvents = new ArrayList<Event>();

    public void addResetEvents(Event... events){
        for(Event e:events){
            resetEvents.add(e);
        }
    }

    public void addResetEvent_byAddingTransitions(Event e){
        for(State s:getStates()){
            if(!s.hasTransition(e.getCode())){
                s.addTranstion(e,start);
            }
        }
    }

    public boolean isResetEvent(String eventCode){
        return resetEventCodes().contains(eventCode);
    }

    private List<String> resetEventCodes(){
        List<String> result = new ArrayList<String>();
        for(Event e:resetEvents){
            result.add(e.getCode());
        }
        return result;
    }
}
