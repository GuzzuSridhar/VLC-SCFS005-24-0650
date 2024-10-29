package com.ntuc.generics.methods;

public class GenericMultiTypeCheck {
    // Generic Method accepting 2 variable of two same types
    static <X> void printP(X x, X y) { // x is trated as an Object and hence can be of any sub type of object
        // System.out.println(x.getClass().getSimpleName() + "- " +
        // y.getClass().getSimpleName());
        try {
            if (!x.getClass().equals(y.getClass())) {
                throw new Exception("Invalid Argument types");
            } else {
                System.out.println(x + " - " + y);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        printP("Name", "Alex");
        printP("City", "Singapore");
        printP("NRIC", "ABC0011");
        printP("Ten", true);
        printP(10, "10");

    }
}
