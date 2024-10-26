package com.ntuc.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class TryReources {
    public static void main(String[] args) {
        try (FileReader file = new FileReader("nothing.txt")) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Try with resources
// hadles the closing of resources implicitly