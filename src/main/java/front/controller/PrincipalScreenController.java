package front.controller;

import core.Automaton;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import enums.Messages;

public class PrincipalScreenController  {

    @FXML
    private TextArea enter;

    @FXML
    private TextArea out;

    private Automaton automaton;

    private static PrincipalScreenController instance;

    public PrincipalScreenController (){
        instance = this;
    }

    public void onClickClear(){
        enter.setText("");
        out.setText("");
    }

    public void onClickAnalyze(){

    automaton = new Automaton();
    automaton.generic();
//        for (int i = 0; i < 4; i++) {
//            appendMessage(i, "teste " + i);
//        }
//        out.appendText("\n"+ enter.getText());
    }

    public void appendMessage(int messagePosition, String expression){
        String message = Messages.values()[messagePosition].getMessage();
        out.appendText(message + expression);
    }

    public static PrincipalScreenController getInstance() {
        return instance;
    }
}
