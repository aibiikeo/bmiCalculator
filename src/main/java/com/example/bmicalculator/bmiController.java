package com.example.bmicalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class bmiController {
    @FXML
    private Label height;
    @FXML
    private Label weight;
    @FXML
    private Label bmi;
    @FXML
    private Label result;
    @FXML
    private TextField heightInput;
    @FXML
    private TextField weightInput;

    @FXML
    protected void onCalculateButtonClick() {

    }
    protected void onClearButtonClick() {
        heightInput.setText("");
        weightInput.setText("");
    }
}