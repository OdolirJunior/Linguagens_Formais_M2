package front.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import enums.Messages;

public class PrincipalScreenController  {

    @FXML
    private TextArea enter;

    @FXML
    private TextArea out;

    public void onClickClear(){
        enter.setText("");
        out.setText("");
    }

    public void onClickAnalyze(){

        for (int i = 0; i < 4; i++) {
            appendMessage(i, "teste " + i);
        }
        out.appendText("\nteste");


    }

    public void appendMessage(int messagePosition, String expression){
        String message = Messages.values()[messagePosition].getMessage();
        out.appendText(message + expression);
    }
}
