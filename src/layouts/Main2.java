package layouts;

/**
 * Created by Роман Лотоцький on 13.12.2016.
 */

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sample.ConfirmBox;

public class Main2 extends Application {

    Stage window;
    Button button;
    Scene scene;
    ComboBox<String> comboBox;
    ListView<String> listView;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

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
        choiceBox.getSelectionModel().
                selectedItemProperty().
                addListener((v, oldValue, newValue) -> System.out.println(newValue));
        Button buttonCB = new Button("Print the choice");
        buttonCB.setOnAction(e -> getChoice(choiceBox));

        comboBox = new ComboBox<>();
        comboBox.getItems().setAll("Terminator", "Masc 2", "Listener");
        comboBox.setPromptText("My favorite movie");
        comboBox.setOnAction(e -> System.out.println(comboBox.getValue()));
        comboBox.setEditable(true);

        listView = new ListView<>();
        listView.getItems().addAll("ice-cream", "sweety", "candy");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        Button buttonForListView = new Button("submit list");
        buttonForListView.setOnAction(e -> ckicked());
        VBox vBox = new VBox();
        vBox.getChildren().addAll(textField, button, box1, box2, buttonForCheck,
                buttonCB, choiceBox, comboBox, listView, buttonForListView);
        vBox.setPadding(new Insets(10, 10, 10, 10));
        vBox.setSpacing(10);
        Scene scene = new Scene(vBox, 500, 550);
        window.setScene(scene);
        window.show();
    }

    private void ckicked() {
        StringBuilder message = new StringBuilder("");
        ObservableList<String> myFavorite;
        myFavorite = listView.getSelectionModel().getSelectedItems();
        for(String s : myFavorite){
            message.append(s + "\n");
        }
        System.out.println(message);
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
