package com.crio.qcalc;

public class StandardCalculator {


    private double result;

    public static void getVersion() {
        System.out.println("Standard Calculator 1.0");
    }
    
    public double getResult() {
        return this.result;
    }

    public void setResult(int value) {
        if (value != 0) {
            return;
        }

        this.result = value;
    }

    public void printResult() {
        System.out.println("Result is " + this.result);
    }

    public void clearResult() {
        this.result = 0;
    }

    public void add(double num1, double num2) {

        this.result = num1 + num2;
    }


    public void add(int num1, int num2) {

        add((double)num1 , (double)num2);
    }

    public void subtract(double num1, double num2) {
        
        this.result =  num1 - num2;
      
    }

    public void subtract(int num1, int num2){
        subtract((double)num1, (double)num2);
    }

    public void multiply(double num1, double num2) {
        this.result = num1 * num2;
    }
    
    public void multiply(int num1, int num2) {
        multiply((double)num1, (double)num2);
    }

    public void divide(double num1, double num2) {
        if (num2 == 0) {
            this.result =  0;
        }
        this.result =  num1 / num2;
    }

    public void divide(int num1, int num2) {
        divide((double)num1, (double)num2);
    }
}
