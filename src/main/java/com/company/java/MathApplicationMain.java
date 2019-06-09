package com.company.java;

public class MathApplicationMain {
    public static void main(String [] args){
        CalculatorServiceImp calculatorServiceImp = new CalculatorServiceImp();
        MathApplication mathApplication = new MathApplication();
        mathApplication.setCalculatorService(calculatorServiceImp);
        System.out.println(mathApplication.add(1,2));
    }
}

class CalculatorServiceImp implements CalculatorService{

    public double add(double input1, double input2) {
        return input1 + input2;
    }

    public double subtract(double input1, double input2) {
        return input1 - input2;
    }

    public double multiply(double input1, double input2) {
        return input1 * input2;
    }

    public double divide(double input1, double input2) {
        return input1/input2;
    }
}