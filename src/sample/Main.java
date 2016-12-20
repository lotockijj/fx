package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        window.setTitle("The new Boston");
        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

        button = new Button("Click Me");
        button.setOnAction(e -> {
            Boolean result = ConfirmBox.display("Title of the window",
                    "Are you sure you want to send naked pics");
            System.out.println(result);
        });

        Button savedButton = new Button("Save after closing program");
        savedButton.setOnAction(e -> closeProgram());

        StackPane layout = new StackPane();
        layout.getChildren().addAll(savedButton, button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void closeProgram() {
        Boolean answer = ConfirmBox.display("Title", "Are you sure you want to close program");
        if(answer) {
            window.close();
        }
    }

}
