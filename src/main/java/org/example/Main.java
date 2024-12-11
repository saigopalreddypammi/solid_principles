package org.example;

import org.example.ocp.Addition;
import org.example.ocp.CalculatorOperation;

public class Main {
    public static void main(String[] args) {
        CalculatorOperation calculatorOperation = new Addition(2,3);

        calculatorOperation.perform();

    }
}