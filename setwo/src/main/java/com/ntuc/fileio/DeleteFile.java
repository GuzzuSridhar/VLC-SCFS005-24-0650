package com.ntuc.fileio;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("yourfile.txt");
        if (file.exists()) {
            file.delete();
            System.out.println("file deleted!!!");
        } else
            System.out.println("file does not exist");
    }
}
