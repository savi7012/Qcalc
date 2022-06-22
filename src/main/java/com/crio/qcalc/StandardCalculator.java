package com.crio.qcalc;

public class StandardCalculator {


    private int result;

    public static void getVersion() {
        System.out.println("Standard Calculator 1.0");
    }
    
    public int getResult() {
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

    public void add(int num1, int num2) {
        this.result = num1 + num2;
        // return this.result;
    }

    public void subtract(int num1, int num2) {
        if (num1 > num2) {
            this.result =  num1 - num2;
        }
        this.result =  num2 - num1;
    }

    public void multiply(int num1, int num2) {
        this.result =  num1 * num2;
    }

    public void divide(int num1, int num2) {
        if (num2 == 0) {
            this.result =  0;
        }
        this.result =  num1 / num2;
    }

}
