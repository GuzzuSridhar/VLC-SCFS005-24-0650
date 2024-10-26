package com.ntuc.exceptions;

import com.ntuc.exceptions.custom.AgeBoundException;

public class ThrowsDemo {
    public static void main(String[] args) throws AgeBoundException {
        ThrowsDemo td = new ThrowsDemo();
        td.testThrows(); // handle the error here or use throws to leave it unhandled
    }

    // by writing the throws exception, the exception handling responsibility lies
    // on the calling method
    void testAge() throws AgeBoundException {
        int age = 15;
        if (age < 18) {
            throw new AgeBoundException("Custom exception raised");
        } else {
            System.out.println("Eligible");
        }
    }

    // exception handled in the calling method
    // void testThrows() {
    // try {
    // testAge();
    // } catch (AgeBoundException e) {
    // System.out.println(e.getMessage());
    // }
    // }

    // propogating the error handling further by adding the throws exception
    void testThrows() throws AgeBoundException {
        testAge();
    }
}
