package com.ntuc.fileio;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("myfile.txt"); // creates the file in the project home
        // folder
        // File file = new File("d:\\myfile.txt"); // creates the file in the custom
        // folder
        try {
            if (file.createNewFile()) {
                System.out.println("File Created");
            } else {
                System.out.println("File Exists");
            }
        } catch (IOException e) {
            System.out.println("Cannot create a file");
        }

    }
}
