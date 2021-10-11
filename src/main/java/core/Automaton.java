package core;

import front.controller.PrincipalScreenController;
import model.State;

import java.util.HashMap;

public class Automaton {

    private HashMap<Integer, State> states;

    public void automaton(){
        states = new HashMap<>();

        State q2 = new State(true);
        q2.setTransitions('a', 3);
        q2.setTransitions('c', 2);
        q2.setTransitions('d', 9);
        states.put(2, q2);

        State q1 = new State(true);
        q1.setTransitions('d', 7);
        states.put(1, q1);

        State q0 = new State(true);
        q0.setTransitions('c', 6);
        q0.setTransitions('d', 7);
        states.put(1, q0);

    }

    public void generic(){
        PrincipalScreenController.getInstance().appendMessage(0,"tester");
    }
}
