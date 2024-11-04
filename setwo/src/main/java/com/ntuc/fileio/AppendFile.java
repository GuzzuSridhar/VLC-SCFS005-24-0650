package com.ntuc.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("myfile.txt", true)) {
            fw.write("This is a sample text written from java io \n");
            fw.write("This is a some more text written from java io \n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// filewriter object writes one character at a time
