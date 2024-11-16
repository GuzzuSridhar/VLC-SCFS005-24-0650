package com.ntuc.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int res = calculator.add(10, 20);
        assertEquals(30, res);
    }

    @Test
    public void testSubstract() {
        Calculator calculator = new Calculator();
        int res = calculator.subtract(20, 5);
        assertEquals(15, res);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int res = calculator.multiply(2, 5);
        assertEquals(10, res);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        double res = calculator.divide(10, 2);
        assertEquals(5.0, res);
    }

    // test if an exception is raised when the denominator is zero
    @Test
    public void testException() {
        Calculator calculator = new Calculator();
        assertThrowsExactly(ArithmeticException.class, () -> calculator.divide(10, 0));

    }
}
