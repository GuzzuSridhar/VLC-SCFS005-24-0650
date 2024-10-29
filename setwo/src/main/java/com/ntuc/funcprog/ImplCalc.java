package com.ntuc.funcprog;

public class ImplCalc {
    public static void main(String[] args) {
        Calculator add = (x, y) -> x + y;
        Calculator sub = (x, y) -> x - y;
        Calculator pro = (x, y) -> x * y;
        Calculator div = (x, y) -> y != 0 ? x / y : 0;

        // test the implementation (Lambda's)
        int res = add.opr(10, 20);
        System.out.println(res);
        res = sub.opr(10, 20);
        System.out.println(res);
        res = pro.opr(10, 20);
        System.out.println(res);
        res = div.opr(10, 20);
        System.out.println(res);
    }
}
