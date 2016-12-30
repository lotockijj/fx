package layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.swing.*;

/**
 * Created by Роман Лотоцький on 13.12.2016.
 */
public class GridPaneLayout extends Application {


    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label label = new Label("User name");
        GridPane.setConstraints(label, 0, 0);

        TextField nameInput = new TextField("Roman");
        GridPane.setConstraints(nameInput, 1, 0);

        Label password = new Label("Password");
        GridPane.setConstraints(password, 0, 1);

        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);

        Button logibutton = new Button("Log in");
        GridPane.setConstraints(logibutton, 1, 2);

        grid.getChildren().addAll(label, nameInput, password, passInput, logibutton);

        Scene scene = new Scene(grid, 300, 200);
        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
