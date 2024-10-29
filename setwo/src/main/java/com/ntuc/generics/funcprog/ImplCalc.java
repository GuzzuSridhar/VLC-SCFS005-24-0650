package com.ntuc.generics.funcprog;

import com.ntuc.funcprog.Claculator;

public class ImplCalc {
    public static void main(String[] args) {
        Calculator<Integer> add = (x, y) -> x + y;
        Calculator<Integer> sub = (x, y) -> x - y;
        Calculator<Integer> pro = (x, y) -> x * y;
        Calculator<Integer> div = (x, y) -> y != 0 ? x / y : 0;
    }
}
