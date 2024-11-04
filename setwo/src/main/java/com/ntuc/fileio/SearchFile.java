package com.ntuc.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("myfile.txt"))) {
            try (Scanner input = new Scanner(System.in)) {
                System.out.print("Enter a Phrase to Search for: ");
                String searchPrase = input.nextLine();
                while (reader.ready()) {
                    if (reader.readLine().contains(searchPrase)) {
                        System.out.println("the file contains the phrase " + searchPrase);
                        break;
                    } else {
                        System.out.println("the file does not contain the phrase " + searchPrase);
                    }
                }
            }
        } catch (IOException e) {
        }
    }
}
