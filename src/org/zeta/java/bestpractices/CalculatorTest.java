package org.zeta.java.bestpractices;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator addition = new AdditionCalculator();
        Calculator subtraction = new SubtractionCalculator();

        CalculationClient calc = new CalculationClient(addition);
        calc.performCalculation(12, 26);

        calc = new CalculationClient(subtraction);
        calc.performCalculation(30, 13);
    }
}
