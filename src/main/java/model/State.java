package model;

import java.util.HashMap;

public class State {

    private Boolean accept;
    private HashMap transitions;

    public State(Boolean accept) {
        this.accept = accept;
        this.transitions = new HashMap();
    }

    public Boolean getAccept() {
        return accept;
    }

    public void setAccept(Boolean accept) {
        this.accept = accept;
    }

    public Integer getTransition(Character simbolo)
    {
        return (Integer) transitions.get(simbolo);
    }

    public void setTransitions(Character simbolo, Integer state) {
        transitions.put(simbolo, state);
    }
}
