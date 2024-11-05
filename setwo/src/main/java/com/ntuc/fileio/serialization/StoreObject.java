package com.ntuc.fileio.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StoreObject {
    public static void main(String[] args) {
        Employee employee = new Employee(100, "Alex");
        // storing the object to an file
        try (FileOutputStream fileOutputStream = new FileOutputStream("empbak.ser")) {
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
            out.writeObject(employee);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
