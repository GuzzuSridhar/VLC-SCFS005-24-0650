package com.ntuc.fileio.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("empbak.ser")) {
            ObjectInputStream in = new ObjectInputStream(fileInputStream);
            Employee readEmp = (Employee) in.readObject();
            System.out.println(readEmp);
        } catch (IOException | ClassNotFoundException e) {
        }
    }
}
