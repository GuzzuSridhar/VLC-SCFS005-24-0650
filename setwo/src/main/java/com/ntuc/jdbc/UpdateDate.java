package com.ntuc.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class UpdateDate {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdata", "root", "pass");
            Statement stmt = conn.createStatement();
            Date doj = Date.valueOf(LocalDate.now());
            String sql = "update emp set doj = '" + doj + "'";
            System.out.println(sql);
            int res = stmt.executeUpdate(sql);
            System.out.println(res + " rows updated");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
