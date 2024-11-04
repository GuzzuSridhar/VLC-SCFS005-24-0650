package com.ntuc.fileio;

public class GetCurrentDir {
    public static void main(String[] args) {
        String cd = System.getProperty("user.dir");
        System.out.println(cd);
    }
}
