package com.student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Calculator {
// Create logger for this class
    private static final Logger logger =
        LoggerFactory.getLogger(Calculator.class);
    public int add(int a, int b) {
        return a + b; // Simple. Nothing can go wrong. No logging needed.
        }

    public int subtract(int a, int b) {
        return a - b; // Same here. No logging needed.
        }
        
    public int divide(int a, int b) {
        if (b == 0) {
            logger.error("Division by zero: a={}, b={}", a, b);
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
        }

    public int multiply(int a, int b) {
        return a * b; // Simple. No logging needed.
        }
}