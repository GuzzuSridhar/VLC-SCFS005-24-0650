package com.ntuc.exceptions.custom;

public class UseCustom {
    public static void main(String[] args) {
        int age = 15;
        try {
            if (age < 18) {
                throw new AgeBoundException("Not Eligible");
            }
        } catch (AgeBoundException a) {
            System.out.println(a.getMessage());
        }
    }
}
