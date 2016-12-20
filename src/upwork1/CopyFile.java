package upwork1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.*;

/**
 * Created by Роман Лотоцький on 11.12.2016.
 */
/*      Need a Graphical User interface that takes the name of a file to read
        from and the name of a file to write to including relative or
        complete path to the file. It should have 2 buttons and a status
        bar to inform the user when the operation is complete, or if any
        problems are encountered. less*/
public class CopyFile extends Application{

    Stage window;
    ProgressIndicator progressIndicator;
    TextField textFieldRead, textFieldWrite;

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        window.setTitle("Copy file into another file");
        Label labelRead = new Label("File  to read");
        textFieldRead = new TextField();
        Label labelWrite = new Label("File to write");
        textFieldWrite = new TextField();
        Button buttonWrite = new Button("Write into file");
        Button buttonCancel = new Button("    Cancel     ");

        buttonWrite.setOnAction(e -> {
            System.out.println(textFieldRead.getText() + " " + textFieldWrite.getText());
            createReader(textFieldRead.getText(), textFieldWrite.getText());
        });
        buttonCancel.setOnAction(e -> System.exit(0));
        HBox hBoxRead = new HBox();
        hBoxRead.getChildren().addAll(labelRead, textFieldRead, buttonWrite);

        HBox hBoxWrite = new HBox();
        hBoxWrite.getChildren().addAll(labelWrite, textFieldWrite, buttonCancel);

        progressIndicator = new ProgressIndicator();

        buttonCancel.setOnAction(e -> complete());
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(hBoxRead);
        borderPane.setCenter(hBoxWrite);
        borderPane.setBottom(progressIndicator);

        Scene scene = new Scene(borderPane, 400, 150);
        window.setScene(scene);
        window.show();

    }

    private void complete() {
        progressIndicator.setProgress(1);
        textFieldRead.setText(null);
        textFieldWrite.setText(null);

    }

    private void createReader(String filePathRead, String filePathWrite) {
        FileInputStream fis;
        FileWriter fileWriter;
        try {
            fis = new FileInputStream(filePathRead);
            BufferedReader buff = new BufferedReader(new InputStreamReader(fis));

            fileWriter = new FileWriter(filePathWrite, true);
            BufferedWriter bw = new BufferedWriter(fileWriter);

            String aLine = null;
            while((aLine = buff.readLine()) != null){
                bw.write(aLine);
                bw.newLine();
            }
            if(bw != null){
                bw.close();
                complete();
            }
            if(buff != null) {
                buff.close();
            }
        } catch (IOException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
