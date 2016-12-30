package FXMLExample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

/**
 * Created by Роман Лотоцький on 24.12.2016.
 */
public class FXMLExampleController {

    @FXML private Text actiontarget;

    @FXML protected void handleSubmitButtonAction(ActionEvent event){

        actiontarget.setText("Sign in button pressed");
    }
}
