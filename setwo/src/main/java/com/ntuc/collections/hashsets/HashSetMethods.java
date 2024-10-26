package com.ntuc.collections.hashsets;

import java.util.HashSet;

public class HashSetMethods {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        // Adding names
        names.add("Alice");
        names.add("Alex");
        names.add("James");
        names.add("Bill");
        names.add("Alice"); // duplicate and will not be added
        names.add("Alex"); // duplicate and will not be added
        names.add("James"); // duplicate and will not be added
        names.add("Bill"); // duplicate and will not be added

        // display the HashSet
        System.out.println(names); // the order may not always be the same

        // check for an elements existence
        System.out.println(names.contains("Bill"));

        // Remove an element
        names.remove("Bill");
        System.out.println(names);

        // size of the set
        System.out.println(names.size());

        // clear the set
        names.clear();
        System.out.println(names);

    }
}
