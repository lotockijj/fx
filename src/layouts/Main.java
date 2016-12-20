package layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.BufferedReader;

/**
 * Created by Роман Лотоцький on 11.12.2016.
 */
public class Main extends Application{

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("My title");

        HBox topMenu = new HBox();
        topMenu.setPadding(new Insets(10, 10, 10, 10));
        topMenu.setSpacing(10);
        Button buttonA = new Button("File");
        Button buttonB = new Button("Edit");
        Button buttonC = new Button("View");
        topMenu.getChildren().addAll(buttonA, buttonB, buttonC);

        VBox leftMenu = new VBox();
        leftMenu.setPadding(new Insets(10, 10, 10, 10));
        leftMenu.setSpacing(10);
        Button buttonD = new Button("D");
        Button buttonF = new Button("F");
        Button buttonE = new Button("E");
        leftMenu.getChildren().addAll(buttonD, buttonF, buttonE);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        Scene scene = new Scene(borderPane, 300, 250);
        window.setScene(scene);
        window.show();

    }
}
