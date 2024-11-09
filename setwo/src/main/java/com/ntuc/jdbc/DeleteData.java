package com.ntuc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdata", "root", "pass")) {
            Statement stmt = conn.createStatement();
            String sql = "delete from emp";
            int res = stmt.executeUpdate(sql);
            System.out.println(res + " rows deleted");
        } catch (SQLException e) {
            e.getMessage();
        }
    }
}
