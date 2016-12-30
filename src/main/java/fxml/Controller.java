package fxml;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Роман Лотоцький on 26.12.2016.
 */
public class Controller implements Initializable{

    public Button button;

    public void handleButtonClick(){
        System.out.println("Run some code user doesn't see");
        button.setText("Stop touching me!");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Loading user data... ");
    }
}
