package org.example.ocp;

import lombok.Data;

@Data
public class Subtraction implements  CalculatorOperation{
    private double a;
    private double b;
    private double result = 0.0;

    @Override
    public void perform() {
        result = a - b;
    }
}
