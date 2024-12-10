package com.ntuc.optionals;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String value = null;
        Optional<String> optValue = Optional.ofNullable(value);

        // check the object's presence before accessing
        if (optValue.isPresent())
            System.out.println(optValue.get().length());
        else
            System.out.println("The String is null");
    }
}
