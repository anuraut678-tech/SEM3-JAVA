package com.mycompany.practical_2b;

// Interface for arithmetic operations
interface ArithmeticFunctions {

    double sum(double num1, double num2);

    double difference(double num1, double num2);

    double product(double num1, double num2);

    double quotient(double num1, double num2);
}

// Class implementing the interface
class SimpleCalculator implements ArithmeticFunctions {

    @Override
    public double sum(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double difference(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double product(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double quotient(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return num1 / num2;
    }
}

public class Practical_2b {

    public static void main(String[] args) {

        ArithmeticFunctions calc = new SimpleCalculator();

        double a = 30;
        double b = 6;

        System.out.println("Sum = " + calc.sum(a, b));
        System.out.println("Difference = " + calc.difference(a, b));
        System.out.println("Product = " + calc.product(a, b));
        System.out.println("Quotient = " + calc.quotient(a, b));
    }
}