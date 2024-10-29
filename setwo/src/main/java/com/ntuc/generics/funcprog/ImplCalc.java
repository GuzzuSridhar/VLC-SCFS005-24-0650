package com.ntuc.generics.funcprog;

public class ImplCalc {
    public static void main(String[] args) {
        Calculator<Integer> add = (x, y) -> x + y;
        Calculator<Integer> sub = (x, y) -> x - y;
        Calculator<Integer> pro = (x, y) -> x * y;
        Calculator<Integer> div = (x, y) -> y != 0 ? x / y : 0;

        Calculator<String> join = (x, y) -> x + y;

        // call the functional methods
        System.out.println(add.opr(10, 20));
        System.out.println(sub.opr(10, 20));
        System.out.println(div.opr(10, 20));
        System.out.println(pro.opr(10, 20));

        System.out.println(join.opr("Hello ", "World"));

    }
}
