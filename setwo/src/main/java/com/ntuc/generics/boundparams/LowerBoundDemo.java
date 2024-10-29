package com.ntuc.generics.boundparams;

import java.util.List;

public class LowerBoundDemo {
    public static void main(String[] args) {
            List<Integer> nums = List.of(1, 2, 3, 4);
            List<Double> dubs = List.of(1.5, 2.5, 3.6, 4.6);
            List<String> names = List.of("One", "Two", "three");
    
            printNums(nums);
            // printNums(names);
            // printNums(dubs);
            

    
        }
    
        static void printNums(List<? super Integer> num) {
            for (Object n : num) {
                System.out.println(n);
            }
            System.out.println();
        }
    }
}
