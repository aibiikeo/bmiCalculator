package com.example.bmicalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class bmiController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}