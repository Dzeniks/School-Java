package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    TextField myTextField;
    @FXML
    Label myLabel;

    @FXML
    void ChangeText() throws IOException {
        String testText = myTextField.getText();
        myLabel.setText(testText);
    }

}
