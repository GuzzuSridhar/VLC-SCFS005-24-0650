package com.ntuc.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// demo of checked exceptions
public class Checked {
    public static void main(String[] args) {
        FileReader file = null;
        try {
            file = new FileReader("nothing.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
 * Checked exceptions are to be handled and if not done so, the code does not
 * compile
 * 
 * Examples
 * SqlException
 * IOException
 * FileNotFoundException
 * ClassNotFoundException
 */