package com.ntuc.fileio;

import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("myfile.txt")) { // reads one character at a time
            int chr;
            while ((chr = fileReader.read()) != -1) {
                System.out.print((char) chr);
            }
        } catch (IOException e) {
        }
    }
}
