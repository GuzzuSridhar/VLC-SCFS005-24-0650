package com.ntuc.fileio;

import java.io.File;

public class MoveFile {
    public static void main(String[] args) {
        File file = new File("myfile.txt");
        if (file.renameTo(new File("d:\\myfile.txt")))
            System.out.println("File moved");
        else {
            System.out.println("could not move");
        }
    }
}
