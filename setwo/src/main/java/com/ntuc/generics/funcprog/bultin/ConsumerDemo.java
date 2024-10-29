package com.ntuc.generics.funcprog.bultin;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        greet.accept("James");
    }

    static Consumer<String> greet = u -> System.out.println("Hello " + u);
}
