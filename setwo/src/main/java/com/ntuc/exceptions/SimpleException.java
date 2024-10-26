package com.ntuc.exceptions;

public class SimpleException {
    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        int i = 10, j = 0, res = 0;
        try {
            res = divide(i, j);
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally { // executed in all cases
            System.out.println("finally executed");
        }
    }
}

/*
 * finally block is used to close resources
 */