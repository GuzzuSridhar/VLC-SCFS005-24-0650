package com.ntuc.collections.hashsets;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // create a HashSet
        HashSet<String> names = new HashSet<>();

        // Adding names
        names.add("Alice");
        names.add("Alex");
        names.add("James");
        names.add("Bill");
        names.add("Alice"); // duplicate and will not be added
        names.add("Alex"); // duplicate and will not be added
        names.add("James");
        names.add("Bill");

        for (String string : names) {
            System.out.println(string);
        }

    }
}
