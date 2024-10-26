package com.ntuc.exceptions;

public class Unchecked {
    public static void main(String[] args) {
        String[] names = { "Alex", "David" };
        String test = "Hello";
        try {
            System.out.println(names[1]); // may throw a ArrayIndexOutofBoundException
            System.out.println(test.charAt(6)); // may throw a StringIndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
 * unchecked exceptions
 * thrown only at runtime
 * Examples
 * ArrayIndexOutofBoundException
 * StringIndexOutOfBoundsException
 * NullPointerException
 */