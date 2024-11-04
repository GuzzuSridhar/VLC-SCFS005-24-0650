package com.ntuc.fileio;

import java.io.File;

public class CreateDir {
    public static void main(String[] args) {
        // creating a single directory
        File file = new File("dir1");
        file.mkdir();
        // create sub directories
        File file1 = new File("dir1\\dire2\\dir3");
        file1.mkdirs();
    }
}
