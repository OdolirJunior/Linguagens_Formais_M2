package core;

import enums.Messages;
import front.controller.PrincipalScreenController;
import model.State;

import java.util.HashMap;

public class Automaton {

    private HashMap<Integer, State> states;


    public void automaton(){
        states = new HashMap<>();

        State q2 = new State(true);
        q2.setTransitions('a', 3);
        q2.setTransitions('b', 10);
        q2.setTransitions('c', 2);
        q2.setTransitions('d', 9);
        q2.setTransitions('e', 10);
        q2.setTransitions('+', 11);
        q2.setTransitions('-', 11);
        q2.setTransitions('*', 11);
        q2.setTransitions('/', 11);

        states.put(0, q2);

        State q1 = new State(true);
        q1.setTransitions('a', 10);
        q1.setTransitions('b', 10);
        q1.setTransitions('c', 10);
        q1.setTransitions('d', 7);
        q1.setTransitions('e', 10);
        states.put(1, q1);

        State q0 = new State(true);
        q0.setTransitions('a', 10);
        q0.setTransitions('b', 10);
        q0.setTransitions('c', 6);
        q0.setTransitions('d', 7);
        q0.setTransitions('e', 10);
        states.put(2, q0);


        State q3 = new State(true);
        q3.setTransitions('a', 10);
        q3.setTransitions('b', 4);
        q3.setTransitions('c', 10);
        q3.setTransitions('d', 10);
        q3.setTransitions('e', 10);
        states.put(3, q3);

        State q4 = new State(true);
        q4.setTransitions('a', 5);
        q4.setTransitions('b', 10);
        q4.setTransitions('c', 10);
        q4.setTransitions('d', 10);
        q4.setTransitions('e', 10);
        states.put(4, q4);

        State q5 = new State(true);
        q5.setTransitions('a', 10);
        q5.setTransitions('b', 0);
        q5.setTransitions('c', 10);
        q5.setTransitions('d', 10);
        q5.setTransitions('e', 10);
        states.put(5, q5);

        State q6 = new State(true);
        q6.setTransitions('a', 10);
        q6.setTransitions('b', 10);
        q6.setTransitions('c', 2);
        q6.setTransitions('d', 9);
        q6.setTransitions('e', 10);
        states.put(6, q6);

        State q7 = new State(true);
        q7.setTransitions('a', 10);
        q7.setTransitions('b', 10);
        q7.setTransitions('c', 10);
        q7.setTransitions('d', 10);
        q7.setTransitions('e', 8);
        states.put(7, q7);

        State q8 = new State(true);
        q8.setTransitions('a', 10);
        q8.setTransitions('b', 10);
        q8.setTransitions('c', 10);
        q8.setTransitions('d', 9);
        q8.setTransitions('e', 10);
        states.put(8, q8);

        State q9 = new State(true);
        q9.setTransitions('a', 10);
        q9.setTransitions('b', 10);
        q9.setTransitions('c', 10);
        q9.setTransitions('d', 10);
        q9.setTransitions('e', 1);
        states.put(9, q9);

        State q10 = new State(true);
        states.put(10, q10);
        State q11 = new State(true);
        states.put(11, q11);
    }


    public void generic(String sentence) {
            automaton();
            String input = sentence + " ";
            Integer state = 0;
            String output = "";
            Integer posicao=0;

            for(int i=0; i< sentence.length(); i++) {
                while (input.length() > posicao) {
                    System.out.println(input.charAt(posicao));
                    if(input.charAt(posicao) == ' ') {
                        posicao++;
                    }else{
                        state = states.get(state).getTransition(input.charAt(posicao));
                        if (state == null) {
                            System.out.println("ERRO: símbolo(s) inválido(s)");
                         } else if (state == 10) {
                            System.out.println("ERRO: sentença inválida:");
                        } else if (state == 11) {
                            System.out.println("operador aritmético" + input.charAt(posicao));
                            input = input.substring(posicao);
                        }else if (states.get(state).getAccept()) {
                            output = output + input.charAt(posicao);
                            System.out.println("sentença válida");
                            //PrincipalScreenController.getInstance().appendMessage(Messages.OK, "teste 123");
                        }
                }
                    posicao++;
                }
            }

    }

}

//if (input.charAt(posicao) != ' ') {
//        if (state == null) {
//        System.out.println("ERRO: símbolo(s) inválido(s)");
//        posicao++;
//

//        } else {
//        output = "";
//        input = input.substring(posicao+1);
//        posicao=0;
//        }