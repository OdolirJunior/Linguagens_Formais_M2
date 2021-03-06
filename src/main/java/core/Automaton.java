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
            try {

                for (int i = 0; i < sentence.length(); i++) {
                    Integer state = 0;
                    String output = "";
                    Integer posicao = 0;
                    while (input.length() >= posicao) {
                        if(input.charAt(posicao) != ' ') {
                            state = states.get(state).getTransition(input.charAt(posicao));
                            if (state == null) {
                                PrincipalScreenController.getInstance().appendMessage(Messages.SYMBOL_INVALID, String.valueOf(input.charAt(posicao)));
                                System.out.println("ERRO: s??mbolo(s) inv??lido(s)");
                                state = 0;
                            } else if (state == 10) {
                                PrincipalScreenController.getInstance().appendMessage(Messages.SENTENCE_INVALID, String.valueOf(input.charAt(posicao)));
                                System.out.println("ERRO: senten??a inv??lida:");
                            } else if (state == 11) {
                                PrincipalScreenController.getInstance().appendMessage(Messages.OPERATOR, String.valueOf(input.charAt(posicao)));
                                System.out.println("operador aritm??tico" + input.charAt(posicao));
                                input = input.substring(posicao + 1);
                                break;
                            } else if (states.get(state).getAccept()) {
                                output = output + input.charAt(posicao);
                                System.out.println("senten??a v??lida");
                                PrincipalScreenController.getInstance().appendMessage(Messages.OK, String.valueOf(input.charAt(posicao)));
                            }

                        }
                        posicao++;

                    }

                }
            }catch (Exception err){

            }

    }

}