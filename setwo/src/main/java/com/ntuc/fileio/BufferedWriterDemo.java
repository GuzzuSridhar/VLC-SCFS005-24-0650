package com.ntuc.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("myfile.txt", true))) {
            writer.write("This is written using the Buffered writer");
            writer.newLine();
        } catch (IOException e) {
        }
    }
}

// used when large amounts of data is to be written to a file from the java app
// reduces the # io operations
