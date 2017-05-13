package layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created by Роман Лотоцький on 22.12.2016.
 */
public class MenuFX extends Application{

    Stage window;
    BorderPane layout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("FX");

        Menu fileMenu = new Menu("Menu");
        fileMenu.getItems().add(new MenuItem("New project..."));
        fileMenu.getItems().add(new MenuItem("New model..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Import project..."));
        fileMenu.getItems().add(new MenuItem("Settings..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Exit... "));

        MenuItem newFile = new MenuItem("New...");
        newFile.setOnAction(e -> System.out.println("New is clicked!"));
        fileMenu.getItems().add(newFile);

        Menu menuEdit = new Menu("_Edit");
        menuEdit.getItems().add(new MenuItem("Cut"));
        menuEdit.getItems().add(new MenuItem("Copy"));

        MenuItem pasteItem = new MenuItem("Paste");
        pasteItem.setOnAction(e -> System.out.println("Pasting..."));
        pasteItem.setDisable(true);
        menuEdit.getItems().add(pasteItem);

        Menu helpMenu = new Menu("Help");
        CheckMenuItem showLines = new CheckMenuItem("Show line number");
        showLines.setOnAction(e -> {
            if(showLines.isSelected()){
                System.out.println("Program now didplay line number...");
            } else {
                System.out.println("Hiding line number...");
            }
        });
        CheckMenuItem autoSave = new CheckMenuItem("Enable Autosave");
        autoSave.setSelected(true);
        helpMenu.getItems().addAll(showLines, autoSave);

        Menu difficultyMenu = new Menu("Dificulty menu");
        ToggleGroup dificultyToggle = new ToggleGroup();

        RadioMenuItem easy = new RadioMenuItem("Easy");
        RadioMenuItem medium = new RadioMenuItem("Medium");
        RadioMenuItem hard = new RadioMenuItem("Hard");

        easy.setToggleGroup(dificultyToggle);
        medium.setToggleGroup(dificultyToggle);
        hard.setToggleGroup(dificultyToggle);

        difficultyMenu.getItems().addAll(easy, medium, hard);

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, menuEdit, helpMenu, difficultyMenu);

        Button changeStyleModena = new Button("Change style Modena");
        changeStyleModena.setOnAction(e -> setUserAgentStylesheet(STYLESHEET_MODENA));

        Button changeStyleCaspian = new Button("Change style caspian");
        changeStyleCaspian.setOnAction(e -> setUserAgentStylesheet(STYLESHEET_CASPIAN));

        HBox hBox = new HBox();
        hBox.getChildren().addAll(changeStyleCaspian, changeStyleModena);
        layout = new BorderPane();
        layout.setTop(menuBar);
        layout.setBottom(hBox);
        Scene scene = new Scene(layout, 370, 370);
        window.setScene(scene);
        window.show();
    }
}
