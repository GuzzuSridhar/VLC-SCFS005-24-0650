package com.ntuc.collections.hashmaps;

import java.util.HashMap;

public class MapMethods {
    public static void main(String[] args) {

        HashMap<Integer, String> nameList = new HashMap<>();

        // add values to the Map
        nameList.put(1, "Alice");
        nameList.put(2, "Adam");
        nameList.put(3, "Alex");
        nameList.put(4, "Anna");

        // print the map
        System.out.println(nameList);

        // access specific record
        String val = nameList.get(1); // returns Alice
        System.out.println(val);

        // update a record (use the same method as insert)
        nameList.put(4, "David");
        System.out.println(nameList);

        // remove elements
        nameList.remove(4);
        System.out.println(nameList);

        // check for presence of key / value
        boolean isKeyPresent = nameList.containsKey(1);
        boolean isValPresent = nameList.containsValue("Alice");
        System.out.println(isKeyPresent);
        System.out.println(isValPresent);

    }
}
