package fxml;/**
 * Created by Роман Лотоцький on 26.12.2016.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader()
                .getResource("sample.fxml"));
        primaryStage.setTitle("my");
        primaryStage.setScene(new Scene(root, 500, 575));
        primaryStage.show();
    }
}
