package com.ntuc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ResultSetUpdate {
    public static void main(String[] args) {
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdata", "root", "pass");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            // Statement stmt = conn.createStatement();

            /*
             * ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE
             * are added to enable the resultset updation
             */

            ResultSet rs = stmt.executeQuery("select * from emp");
            if (rs.next())
                System.out.println("Here");
            rs.updateInt(1, 1001);
            rs.updateString(2, "Border");
            rs.updateRow();

        } catch (SQLException e) {
            Logger.getLogger(SelectData.class.getName()).log(Level.SEVERE, "Error", e);
        }
    }
}
