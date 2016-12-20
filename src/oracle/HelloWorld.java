package oracle;
/**
 * Created by Роман Лотоцький on 14.12.2016.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    Stage window;
    Button button;
    Scene scene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;

        TextField textField = new TextField();

        button = new Button("Click Me");
        button.setOnAction(e -> isInt(textField, textField.getText()));

        Button buttonForCheck = new Button("Order");
        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Tuna");
        buttonForCheck.setOnAction(e -> handleOption(box1, box2));

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("Apples", "Banana", "Cabbage", "Mushroom", "Eggplant");
        choiceBox.setValue("Apples");
        Button buttonCB = new Button("Print the choice");
        buttonCB.setOnAction(e -> getChoice(choiceBox));

        VBox vBox = new VBox();
        vBox.getChildren().addAll(textField, button, box1, box2, buttonForCheck,
                buttonCB, choiceBox);
        vBox.setPadding(new Insets(10, 10, 10, 10));
        vBox.setSpacing(10);
        Scene scene = new Scene(vBox, 400, 350);
        scene.getStylesheets().add(HelloWorld.class.getResource("my.css").toExternalForm());
        window.setScene(scene);
        window.show();
    }
    private void getChoice(ChoiceBox<String> choiceBox) {
        System.out.println(choiceBox.getValue());
    }

    private void handleOption(CheckBox box1, CheckBox box2) {
        String message = "Order is: \n";
        if(box1.isSelected()){
            message += "Bacon\n";
        }
        if(box2.isSelected()){
            message +="Tuna";
        }
        System.out.println(message);
    }

    private boolean isInt(TextField textField, String message) {
        try{
            int age = Integer.parseInt(textField.getText());
            System.out.println("User is " + age);
            return true;
        } catch (NumberFormatException e){
            System.out.println("Error: " + message + " is not a number.");
            System.out.println(e);
            return false;
        }
    }

}
