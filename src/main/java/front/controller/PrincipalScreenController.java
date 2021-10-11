package front.controller;

import core.Automaton;
import javafx.fxml.FXML;

import javafx.scene.control.TextArea;
import enums.Messages;

import java.net.URL;
import java.util.ResourceBundle;

public class PrincipalScreenController {

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
        Automaton automaton = new Automaton();
        System.out.println(enter.getText());
        automaton.generic(enter.getText());
        out.appendText("\n"+ enter.getText());

    }

    public void appendMessage(Messages messages, String expression){
        String message = messages.getMessage();
        out.appendText(message + expression);
    }

    public static PrincipalScreenController getInstance() {
        return instance;
    }


}
