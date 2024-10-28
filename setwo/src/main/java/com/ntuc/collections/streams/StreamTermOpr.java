package com.ntuc.collections.streams;

import java.util.List;

public class StreamTermOpr {
    public static void main(String[] args) {
        List<Integer> numList = List.of(1, 2, 3, 4);
        List<String> strList = List.of("One", "Two", "Three", "Four", "Five");

        // print all the elements using Stream operation
        System.out.println("--------forEach()-------------------");
        strList.stream().forEach(System.out::println);
        numList.stream().forEach(System.out::println);

        // check for any matching elements (Used to search for an element)
        System.out.println("--------anyMatch()-------------------");
        boolean isPresent = strList.stream().anyMatch(e -> e.contains("Six"));
        System.out.println(isPresent);

        // check all of the elements for a condition
        System.out.println("--------allMatch()-------------------");
        boolean isTrue = numList.stream().allMatch(n -> n % 2 == 0);
        System.out.println(isTrue);

        // check if none of the elements meet a condition
        System.out.println("--------noneMatch()-------------------");
        boolean isValid = strList.stream().noneMatch(s -> s.length() == 5);
        System.out.println(isValid);

        // reduce to a single value
        System.out.println("--------reduce()-------------------");
        int res = numList.stream().reduce(0, Integer::sum);
        System.out.println("Adding Elements:" + res);
        res = numList.stream().reduce(1, (x, y) -> x * y);
        System.out.println("Multiplying Elements:" + res);

        // get sum of all even numbers
        res = numList.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);
        System.out.println(res);

    }
}

/*
 * Method - Description - Returns
 * allMatch - Checks if all elements match a condition - true if all elements
 * match,
 * false otherwise
 * anyMatch - Checks if any element matches a condition - true if any element
 * matches, false otherwise
 * noneMatch - Checks if none of the elements match a condition - true if none
 * of
 * the elements match, false otherwise
 * 
 */

// terminal operators cannot be chained
// always is the last operation and only one per stream