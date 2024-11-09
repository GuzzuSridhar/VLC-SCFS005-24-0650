package com.ntuc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectWithExecute {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdata", "root", "pass");
            Statement stmt = conn.createStatement();
            if (stmt.execute("Select ename from emp")) {
                System.out.println("The statements is of select type");
                ResultSet resultSet = stmt.getResultSet();
                while (resultSet.next()) {
                    System.out.println(resultSet.getString(1));
                }
            }
            // } else {
            // System.out.println("The statement is not of select type");
            // }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
