package com.ntuc.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int i = scan.nextInt();
            System.out.println(i);
        } catch (InputMismatchException x) {
            System.out.println("Inavlid number");
        } finally {
            System.out.println("Scanner is being closed.......");
            scan.close();
        }

    }
}
