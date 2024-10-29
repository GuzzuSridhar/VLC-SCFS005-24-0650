package com.ntuc.generics.boundparams;

public class BoundParamsDemo {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String[] sar = { "One", "Two", "Three", "Four" };
        Integer[] iar = { 1, 2, 3, 4, 5 };
        Double[] dar = { 1.5, 2.3, 5.5, 6.0 };
        Boolean[] bar = { true, false, true };
        Long[] lar = { 10l, 20l, 30l };

        System.out.println("----------Using the Generic Method---------");
        // printArr(sar); // String does not extend number class and hence not allowed
        printArr(iar);
        printArr(dar);
        // printArr(bar); // Boolean does not extend number class and hence not allowed
        printArr(lar);

    }

    // generic method to handle any Type that extends Number class
    static <T extends Number> void printArr(T[] t) {
        for (T x : t) {
            System.out.println(x);
        }
    }
}
