package com.ntuc.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SingleCatch {
    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0, j = 0, res = 0;
        try {
            System.out.print("Enter the Numerator: ");
            i = scan.nextInt();
            System.out.print("Enter the Denominator: ");
            j = scan.nextInt();
            res = divide(i, j);
            System.out.println(res);
            // handle more than one exception in a single catch statement
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println(e);
        } finally {
            System.out.println("Closing Scanner");
            scan.close();
        }
    }
}
