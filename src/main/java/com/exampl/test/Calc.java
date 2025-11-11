package com.exampl.test;

public class Calc {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }

    // Main method to run the calculator
    public static void main(String[] args) {
        Calc calculator = new Calc();

        System.out.println("=== Calculator Demo ===");
        System.out.println("Addition: 10 + 5 = " + calculator.add(10, 5));
        System.out.println("Subtraction: 10 - 5 = " + calculator.subtract(10, 5));
        System.out.println("Multiplication: 10 * 5 = " + calculator.multiply(10, 5));
        System.out.println("Division: 10 / 5 = " + calculator.divide(10, 5));

        // Uncomment to see exception handling
        // System.out.println("Division by zero: " + calculator.divide(10, 0));
    }

}
