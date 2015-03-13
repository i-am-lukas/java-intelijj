import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.util.EventListener;

/**
 * Created by lukasz bialkowski on 2015-03-07.
 * This is my first attempt to java FX.
 * @author lukasz bialkowski
 * @version 1.0
 *
 */
public class Main extends Application {

    private Button button;
    private Button button2;


    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle(   "I Will Try Android Soon");

        button = new Button("Click me");
        button.setOnAction(e ->
                System.out.println("cokolwiek"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
       launch(args);
    }

}
