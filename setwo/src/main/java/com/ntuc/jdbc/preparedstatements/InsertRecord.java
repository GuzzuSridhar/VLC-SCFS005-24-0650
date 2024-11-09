package com.ntuc.jdbc.preparedstatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecord {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdata", "root", "pass");

            Scanner input = new Scanner(System.in);
            System.out.print("Enter the Employee Number: ");
            int num = input.nextInt();
            input.nextLine();
            System.out.print("Enter the Employee Name: ");
            String name = input.nextLine();

            String sql = "insert into emp(empno,ename) values(?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, num);
            stmt.setString(2, name);

            System.out.println(sql);
            int res = stmt.executeUpdate();
            System.out.println(res + " rows inserted");
            stmt.close();
            conn.close();
            input.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
