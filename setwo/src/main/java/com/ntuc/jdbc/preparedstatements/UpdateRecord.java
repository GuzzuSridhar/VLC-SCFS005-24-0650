package com.ntuc.jdbc.preparedstatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateRecord {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdata", "root", "pass");

            Scanner input = new Scanner(System.in);
            System.out.print("Enter the Employee Number: ");
            int num = input.nextInt();
            input.nextLine();
            System.out.print("Enter the Employee Name: ");
            String name = input.nextLine();

            String sql = "update emp set ename = ? where empno = ? ";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(2, num);
            stmt.setString(1, name);

            int res = stmt.executeUpdate();
            System.out.println(res + " rows updated");
            stmt.close();
            conn.close();
            input.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
