package com.ntuc.jdbc.preparedstatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteRecord {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdata", "root", "pass")) {
            String sql = "delete from emp where empno= ?";
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a Employee Number to delete? ");
            int num = scan.nextInt();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, num);
            int res = stmt.executeUpdate();
            System.out.println(res + " rows deleted");
        } catch (SQLException e) {
            e.getMessage();
        }
    }
}
