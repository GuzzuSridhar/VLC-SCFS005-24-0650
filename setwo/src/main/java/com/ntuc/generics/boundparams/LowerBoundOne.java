package com.ntuc.generics.boundparams;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundOne {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Number> numList = new ArrayList<>();
        List<String> strList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();

        addIntegerData(numList);
        addIntegerData(objList);
        // addIntegerData(strList); // not allowed

    }

    static void addIntegerData(List<? super Integer> list) {
        list.add(10);
        list.add(100);
        // list.add(100.8); // not allowed

    }
}
