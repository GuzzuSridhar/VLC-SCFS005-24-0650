package com.ntuc.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Emplist {
    public static void main(String[] args) {
        ArrayList<String> empList = new ArrayList<>();
        empList.add("Alex");
        empList.add("Alice");
        empList.add("Dave");
        empList.add("Chris");

        // log of the elements added to the list
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("myfile.txt", true))) {
            for (String string : empList) {
                writer.write(LocalDateTime.now() + "- " + string);
                writer.newLine();
                ;
            }
        } catch (IOException e) {
        }

    }
}
