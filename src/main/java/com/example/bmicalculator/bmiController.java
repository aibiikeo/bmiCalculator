package com.example.bmicalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import java.util.ResourceBundle;
import java.net.URL;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class bmiController implements Initializable{
    @FXML
    private Label unit;
    @FXML
    private ChoiceBox<String> unitChoiceBox;
    protected String[] units = {"Metric units","English units"};
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        unitChoiceBox.getItems().addAll(units);
        unitChoiceBox.setOnAction(this::getUnit);
    }
    public void getUnit(ActionEvent event){
        String unit = unitChoiceBox.getValue();
        bmiCalculator.setUnit(unit);
    }
    @FXML
    private Label height;
    @FXML
    private TextField heightInput;
    @FXML
    private Label weight;
    @FXML
    private TextField weightInput;
    @FXML
    private Label bmi;
    @FXML
    private Label bmiResult;
    @FXML
    private Label status;
    @FXML
    private Label statusResult;

    bmiCalculator bmiCalculator = new bmiCalculator();

    @FXML
    protected void onCalculateButtonClick(){
        double h = Double.parseDouble(heightInput.getText());
        bmiCalculator.setHeight(h);
        double w = Double.parseDouble(weightInput.getText());
        bmiCalculator.setWeight(w);
        bmiCalculator.calculate();
        bmiResult.setText(String.valueOf(bmiCalculator.getResult()));
        statusResult.setText(bmiCalculator.getStatus());
    }
    @FXML
    protected void onClearItemClick() {
        heightInput.setText("");
        weightInput.setText("");
        bmiResult.setText("");
        statusResult.setText("");
    }
    @FXML
    protected void onCloseItemClick() {
        javafx.application.Platform.exit();
    }
    @FXML
    private void onAboutItemClick() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText("BMI Calculator");
        alert.setContentText("-Choose units.\n-Enter your height and weight.\n-Click the \"Calculate\" button.");
        alert.showAndWait();
    }
}