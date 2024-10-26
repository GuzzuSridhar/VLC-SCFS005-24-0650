package com.ntuc.collections.streams;

import java.util.List;

public class StreamTermOpr {
    public static void main(String[] args) {
        List<Integer> numList = List.of(1, 2, 3, 4);
        List<String> strList = List.of("One", "Two", "Three", "Four", "Five");

        // print all the elements using Stream operation
        strList.stream().forEach(System.out::println);
        numList.stream().forEach(System.out::println);

    }
}
