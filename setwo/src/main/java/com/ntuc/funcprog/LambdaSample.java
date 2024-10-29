package com.ntuc.funcprog;

public class LambdaSample {
    public static void main(String[] args) {
        // (s) -> System.out.println(s);
        // is a sample of a lambda expression
        // functional programming
        SimpleFi test = (s) -> System.out.println(s);
        test.print("hello");
    }
}

// class TestFi implements SimpleFi {

// // imperative code
// @Override
// public void print(String s) {
// System.out.println(s);
// }

// }