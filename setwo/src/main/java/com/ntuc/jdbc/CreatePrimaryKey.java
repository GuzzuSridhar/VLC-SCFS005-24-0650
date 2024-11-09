package com.ntuc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreatePrimaryKey {
    public static void main(String[] args) {
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdata", "root", "pass");
            Statement stmt = conn.createStatement();
            stmt.execute("Alter table emp add primary key (empno)");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
