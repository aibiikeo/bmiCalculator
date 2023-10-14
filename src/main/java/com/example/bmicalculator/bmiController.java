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
    private Label bmiResult;
    @FXML
    private Label status;
    @FXML
    private Label statusResult;
    @FXML
    private TextField heightInput;
    @FXML
    private TextField weightInput;

    bmiCalculator bmiCalculator = new bmiCalculator();

    @FXML
    protected void onCalculateButtonClick() {
        double h = Double.parseDouble(heightInput.getText());
        bmiCalculator.setHeight(h);
        double w = Double.parseDouble(weightInput.getText());
        bmiCalculator.setWeight(w);
        bmiCalculator.calculate();
        bmiResult.setText(String.valueOf(bmiCalculator.getResult()));
        statusResult.setText(bmiCalculator.getStatus());
    }
    @FXML
    protected void onClearButtonClick() {
        heightInput.setText("");
        weightInput.setText("");
        bmiResult.setText("");
        statusResult.setText("");
    }
}