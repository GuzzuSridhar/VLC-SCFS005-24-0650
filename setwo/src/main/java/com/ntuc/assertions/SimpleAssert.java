package com.ntuc.assertions;

import java.util.Scanner;

public class SimpleAssert {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        assert age >= 18 : "Invalid age";
        System.out.println(age);
        scan.close();
    }
}

/*
 * By default assert statements are disabled
 * Enable assertions on cmd line
 * use the java -ea
 * 
 */