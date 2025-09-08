package org.zeta.java.bestpractices;

public class CalculationClient {
    private Calculator calculator;

    public CalculationClient (Calculator calculator) {
        this.calculator = calculator;
    }

    public void performCalculation (int first, int second) {
        System.out.println("Result: " + calculator.calculate(first, second));
    }
}
