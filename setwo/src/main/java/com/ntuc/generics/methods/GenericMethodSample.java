package com.ntuc.generics.methods;

public class GenericMethodSample {
    public static void main(String[] args) {
        String[] sar = { "One", "Two", "Three", "Four" };
        Integer[] iar = { 1, 2, 3, 4, 5 };
        Double[] dar = { 1.5, 2.3, 5.5, 6.0 };
        Boolean[] bar = { true, false, true };
        Long[] lar = { 10l, 20l, 30l };

        // print the String Array
        System.out.println("----------Using the Non Generic Methods---------");
        showArr(sar);
        showArr(iar);
        showArr(dar);
        // showArr(bar);
        System.out.println("----------Using the Generic Method---------");
        printArr(sar);
        printArr(iar);
        printArr(dar);
        printArr(bar);
        printArr(lar);
    }

    // imperative methods to print arrays of varius types
    static void showArr(String[] s) {
        for (String string : s) {
            System.out.println(string);
        }
    }

    static void showArr(Integer[] i) {
        for (Integer integer : i) {
            System.out.println(integer);
        }
    }

    static void showArr(Double[] d) {
        for (Double d1 : d) {
            System.out.println(d1);
        }
    }

    // generic method to handle any Type
    static <T> void printArr(T[] t) {
        for (T x : t) {
            System.out.println(x);
        }
    }
}

// Generics are runtime Type inference
