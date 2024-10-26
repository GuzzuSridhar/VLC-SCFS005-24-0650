package com.ntuc.collections.iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {

        // create a List
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Alex");
        names.add("Jim");
        names.add("Jill");

        // getting the iterator of the list
        Iterator<String> iterator = names.iterator();

        // iterating thru the list
        while (iterator.hasNext()) {
            String x = iterator.next();
            System.out.println(x);
        }

        // remove an element using iterator
        while (iterator.hasNext()) {
            String x = iterator.next();
            if ("Jill".equals(x)) {
                iterator.remove();
            }
        }
    }
}

// Iterators can be used on List, Map and Set
// efficient way to loop thru the elements
// three key methods
// 1. hasNext()
// 2. next()
// 3. remove()