package com.ntuc.collections.arraylists;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // creation of an arrayList
        ArrayList<String> names = new ArrayList<>();

        /* METHODS IN ARRAYLIST */

        // adding names
        names.add("Alice");
        names.add("Alex");
        names.add("David");
        names.add("Jim");

        // display the list
        for (String string : names) {
            System.out.println(string);
        }

        // display the size of list
        System.out.println(names.size());

        // change /update the element
        names.set(0, "Dave");

        // remove an element
        names.remove("Dave");

        // contains / search
        boolean doesExist = names.contains("Jim");
        System.out.println(doesExist);

        // get index of an element
        int i = names.indexOf("Jim");
        System.out.println(i);

    }
}

// ArrayLists can contain duplicates
// ordered collection
// is of Generic type <>