package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Label messageLabel;

    @FXML
    protected void onButtonClick() {
        messageLabel.setText("Hello, JavaFX !");
    }
}
