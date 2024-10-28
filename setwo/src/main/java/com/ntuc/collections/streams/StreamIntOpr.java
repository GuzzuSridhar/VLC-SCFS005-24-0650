package com.ntuc.collections.streams;

import java.util.List;

public class StreamIntOpr {
    public static void main(String[] args) {
        List<Integer> numList = List.of(1, 2, 3, 4, 1, 2, 3, 4);
        List<String> strList = List.of("One", "Two", "Three", "Four", "Five");

        // get the distinct values
        System.out.println("------------distinct----------------");
        numList.stream().distinct().forEach(System.out::println);
        // get a sorted list
        System.out.println("------------sorted----------------");
        numList.stream().sorted().forEach(System.out::println);
        strList.stream().sorted().forEach(System.out::println);

        // chain the operators
        System.out.println("------------distict and sorted----------------");
        numList.stream().distinct().sorted().forEach(System.out::println);

        // apply experssion on each element
        System.out.println("------------map----------------");
        numList.stream().distinct().map(x -> x * 2).forEach(System.out::println);
        strList.stream().map(s -> s.toUpperCase()).forEach(System.out::println);

        // filter the list based on a condition

    }
}
