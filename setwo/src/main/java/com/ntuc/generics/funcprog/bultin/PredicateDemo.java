package com.ntuc.generics.funcprog.bultin;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> isValidPhone = phone -> phone.startsWith("+65");
        Predicate<String> isValidPhoneOne = phone -> phone.length() == 11;

        System.out.println(isValidPhone.test("+65 8888 9999"));
        System.out.println(isValidPhone.test("+75 8888 9999"));

        System.out.println(isValidPhoneOne.test("8888999"));
        System.out.println(isValidPhoneOne.test("88889999"));

        // in lambda we can chain methods using the and function
        System.out.println(isValidPhone.and(isValidPhoneOne).test("+6588887777"));

    }
}
