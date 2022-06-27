package com.crio.qcalc;

public class StandardCalculator {


    protected double result;

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

    public final void  add(double num1, double num2) {

        double result = num1 + num2;
        if ((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)) {
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }


    public void add(int num1, int num2) {

        add((double)num1 , (double)num2);
    }

    public void subtract(double num1, double num2) {
        
        double result = num1 - num2;
        if ((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)) {
            throw new ArithmeticException("Double undeflow");
        }
        this.result = result;
      
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
