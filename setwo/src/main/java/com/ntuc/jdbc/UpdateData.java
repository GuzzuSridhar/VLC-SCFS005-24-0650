package com.ntuc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdata", "root", "pass");
            Statement stmt = conn.createStatement();
            String sql = "update emp set ename = 'Sara' where empno = 100";
            int res = stmt.executeUpdate(sql);
            System.out.println(res + " rows updated");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
