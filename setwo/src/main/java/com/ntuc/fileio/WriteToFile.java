package com.ntuc.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("myfile.txt")) {
            fw.write("This is a sample text written from java io \n");
            fw.write("This is a some more text written from java io \n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// fw.write erases the existing content
// creates a file if not present
