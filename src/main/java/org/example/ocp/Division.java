package org.example.ocp;

public class Division implements  CalculatorOperation{
    private double a;
    private double b;
    private double result = 0.0;
    @Override
    public void perform() {
        if(b != 0){
            result = a / b;
        }
        else{
            throw new ArithmeticException("Number cant be divided by zero");
        }
    }
}
