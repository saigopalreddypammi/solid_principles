package org.example.ocp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Addition implements CalculatorOperation{
    private int a;
    private int b;
    private double result = 0;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void perform() {
        result = a + b;
    }
}
