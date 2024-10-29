package com.ntuc.generics.funcprog.bultin;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> randInt = () -> new Random().nextInt(100);

        // get a random number
        System.out.println(randInt.get());
        System.out.println(randInt.get());
        System.out.println(randInt.get());

        Supplier<LocalDateTime> currTime = () -> LocalDateTime.now();

        // get the current time or date
        currTime.get().getHour();
        currTime.get().getDayOfMonth();
    }
}
