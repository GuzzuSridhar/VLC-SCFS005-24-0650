package com.ntuc.jdbc.tcl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SetAutoCommitFlase {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdata", "root", "pass");
            // the autocommit is enabled by default
            // the same has to be disabled on the connection object
            conn.setAutoCommit(false);
            // once the autocommit is set to false
            // the default action would be a rollback

            Statement stmt = conn.createStatement();
            int res = stmt.executeUpdate("insert into emp(empno,ename) values(1010,'TestEmployee') ");
            conn.commit();
            System.out.println(res + " Records Inserted");
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
