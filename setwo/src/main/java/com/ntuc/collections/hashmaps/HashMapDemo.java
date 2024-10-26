package com.ntuc.collections.hashmaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> nameList = new HashMap<>();

        // add values to the Map
        nameList.put(1, "Alice");
        nameList.put(2, "Adam");
        nameList.put(3, "Alex");
        nameList.put(4, "Anna");

        // get the iterator on the map
        Iterator<Map.Entry<Integer, String>> iterator = nameList.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> e = iterator.next();
            System.out.println(e.getKey() + "- " + e.getValue());
        }
    }

}
