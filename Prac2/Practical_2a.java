package com.mycompany.practical_2;

// Abstract class
abstract class CalculatorOperation {

    // Abstract method
    abstract double performOperation(double num1, double num2);

    // Concrete method
    void showResult(String operationName, double result) {
        System.out.println("Result of " + operationName + " = " + result);
    }
}

// Addition class
class SumOperation extends CalculatorOperation {
    @Override
    double performOperation(double num1, double num2) {
        return num1 + num2;
    }
}

// Subtraction class
class DifferenceOperation extends CalculatorOperation {
    @Override
    double performOperation(double num1, double num2) {
        return num1 - num2;
    }
}

// Multiplication class
class ProductOperation extends CalculatorOperation {
    @Override
    double performOperation(double num1, double num2) {
        return num1 * num2;
    }
}

// Division class
class QuotientOperation extends CalculatorOperation {
    @Override
    double performOperation(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return num1 / num2;
    }
}
public class Practical_2 {

    public static void main(String[] args) {

        CalculatorOperation add = new SumOperation();
        CalculatorOperation sub = new DifferenceOperation();
        CalculatorOperation mul = new ProductOperation();
        CalculatorOperation div = new QuotientOperation();

        double x = 50;
        double y = 25;

        add.showResult("Addition", add.performOperation(x, y));
        sub.showResult("Subtraction", sub.performOperation(x, y));
        mul.showResult("Multiplication", mul.performOperation(x, y));
        div.showResult("Division", div.performOperation(x, y));
    }
}
