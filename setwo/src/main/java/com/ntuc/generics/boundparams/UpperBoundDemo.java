package com.ntuc.generics.boundparams;

import java.util.List;

// upper bound with wildcards (?)
public class UpperBoundDemo {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4);
        List<String> names = List.of("One", "Two", "three");

        UpperBoundDemo ud = new UpperBoundDemo();
        ud.printNums(nums);
        // ud.printNums(names); // not allowed as STring does not extend Number

    }

    void printNums(List<? extends Number> num) {
        for (Number n : num) {
            System.out.println(n);
        }
        System.out.println();
    }
}
