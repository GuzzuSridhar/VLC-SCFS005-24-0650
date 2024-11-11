package com.ntuc.jdbc.tcl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class IsDirtyDemo {

    private static boolean isDirty = false;

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbcdata";
        String user = "root";
        String pass = "pass";

        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            conn.setAutoCommit(false);

            insertRec(conn);
            if (isDirty) {
                conn.commit();
                System.out.println("Data Committed");
            } else {
                System.out.println("No uncommitted data");
            }

        } catch (SQLException e) {
            e.getMessage();
        }

    }

    public static void insertRec(Connection conn) {
        try {
            Statement stmt = conn.createStatement();
            // stmt.executeUpdate("insert into emp(empno,ename) values(1011,'TestEmployee')
            // ");
            // isDirty = true;
            stmt.executeQuery("select * from emp ");
            isDirty = false;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
