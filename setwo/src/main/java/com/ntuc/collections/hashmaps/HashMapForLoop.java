package com.ntuc.collections.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class HashMapForLoop {
    public static void main(String[] args) {
        HashMap<Integer, String> nameList = new HashMap<>();

        // add values to the Map
        nameList.put(1, "Alice");
        nameList.put(2, "Adam");
        nameList.put(3, "Alex");
        nameList.put(4, "Anna");
        nameList.put(4, "Bill"); // will override the earlier record

        for (Map.Entry<Integer, String> e : nameList.entrySet()) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
    }
}
