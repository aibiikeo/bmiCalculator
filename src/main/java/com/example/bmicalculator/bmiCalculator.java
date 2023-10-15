package com.example.bmicalculator;
import java.lang.Math;

public class bmiCalculator {
    private double height;
    private double weight;
    private double result;
    private String status;
    private String unit;

    public void calculate(){
//        calculates bmi according chosen units
        if (this.unit == "Metric units"){
            double r = this.weight / (Math.pow(this.height/100,2));
            this.result = Math.round(r * 100.0) / 100.0;
        }
        else if (this.unit == "English units") {
            double r = (703 * this.weight / (Math.pow(this.height,2)));
            this.result = Math.round(r * 100.0) / 100.0;
        }
//        this part shows bmi status
        if(this.result < 18.5)
            this.status = "Underweight";
        else if (this.result < 24.9 && this.result > 18.5) {
            this.status = "Normal";
        }
        else if (this.result < 29.9 && this.result > 25.0) {
            this.status = "Overweight";
        }
        else if (this.result > 30.0) {
            this.status = "Obese";
        }
        else
            this.status = "Error";
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
