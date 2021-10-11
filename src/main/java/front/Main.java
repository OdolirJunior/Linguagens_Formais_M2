package front;

import core.Automaton;
import front.controller.PrincipalScreenController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

//public class Main extends Application{
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage stage) throws Exception {
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/principalscreen/PrincipalScreen.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 800, 500);
////        Image image = new Image(getClass().getResource("/resources/images/icone.png").toExternalForm());
////        stage.getIcons().add(image);
//
//        stage.setTitle("Reconhecedor de Linguagem Regular");
//        stage.setScene(scene);
//        stage.show();
//
//    }
//}

public class Main  {
    public static void main(String[] args) {
        Automaton automaton = new Automaton();
        automaton.generic("+ aabcbcbc");
    }
}