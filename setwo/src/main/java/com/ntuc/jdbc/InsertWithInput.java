package com.ntuc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertWithInput {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdata", "root", "pass");

            Scanner input = new Scanner(System.in);
            System.out.print("Enter the Employee Number: ");
            int num = input.nextInt();
            input.nextLine();
            System.out.print("Enter the Employee Name: ");
            String name = input.nextLine();

            Statement stmt = conn.createStatement();
            String sql = "insert into emp(empno,ename) values("
                    + num
                    + " ,'"
                    + name
                    + "')";
            System.out.println(sql);
            int res = stmt.executeUpdate(sql);
            System.out.println(res + " rows inserted");
            stmt.close();
            conn.close();
            input.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
