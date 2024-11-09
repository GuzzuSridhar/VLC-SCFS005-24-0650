package com.ntuc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BatchInsert {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdata", "root", "pass");
            Statement stmt = conn.createStatement();

            Scanner input = new Scanner(System.in);

            while (true) {
                System.out.print("Enter the Employee Number: ");
                int num = input.nextInt();
                input.nextLine();
                System.out.print("Enter the Employee Name: ");
                String name = input.nextLine();
                String sql = "insert into emp(empno,ename) values("
                        + num
                        + " ,'"
                        + name
                        + "')";
                stmt.addBatch(sql);
                System.out.print("Enter another Record? (0/1)");
                int choice = input.nextInt();
                input.nextLine();
                if (choice == 0) {
                    int[] res = stmt.executeBatch();
                    for (int i : res) {
                        System.out.println(i);
                    }
                    break;
                }
            }

            stmt.close();
            conn.close();
            input.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
