package com.ntuc.generics.methods;

public class GenericMultiType {
    // Generic Method accepting 2 variable of two different types
    static <T, U> void printPair(T t, U u) {
        System.out.println(t + " - " + u);
    }

    // Generic Method accepting 2 variable of two same types
    static <X> void printP(X x, X y) { // x is trated as an Object and hence can be of any sub type of object
        System.out.println(x.getClass().getSimpleName() + "- " + y.getClass().getSimpleName());
        System.out.println(x + " - " + y);
    }

    public static void main(String[] args) {
        printPair(1, "Apple");
        printPair(2, "Mango");
        printPair("String", "Grapes");

        printP("Name", "Alex");
        printP("City", "Singapore");
        printP("NRIC", "ABC0011");
        printP("Ten", true);
        printP("Ten", 10);

    }
}
