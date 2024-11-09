package com.ntuc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AlterTable {
    public static void main(String[] args) {
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdata", "root", "pass");
            Statement stmt = conn.createStatement();
            stmt.execute("Alter table emp add doj date");
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
