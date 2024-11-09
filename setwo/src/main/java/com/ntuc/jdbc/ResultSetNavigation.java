package com.ntuc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ResultSetNavigation {
    public static void main(String[] args) {
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdata", "root", "pass");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            /*
             * ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY
             * are added to enable the resultset navigation in freestyle
             */

            ResultSet rs = stmt.executeQuery("select * from emp");

            // Move to the last record
            if (rs.last())
                System.out.println(rs.getInt(1) + " - " + rs.getString(2));

            // Move to first Record
            if (rs.first())
                System.out.println(rs.getInt(1) + " - " + rs.getString(2));

            // move 2 records from the start
            if (rs.absolute(4))
                System.out.println(rs.getInt(1) + " - " + rs.getString(2));

            // move 2 rows relative to current cusor position
            if (rs.relative(2))
                System.out.println(rs.getInt(1) + " - " + rs.getString(2));

        } catch (SQLException e) {
            Logger.getLogger(SelectData.class.getName()).log(Level.SEVERE, "Error", e);
        }
    }
}
