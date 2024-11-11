package com.ntuc.jdbc.tcl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BactchInsert {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdata", "root", "pass");
            conn.setAutoCommit(false);

            Statement stmt = conn.createStatement();
            int res = stmt.executeUpdate("insert into emp(empno,ename) values(1011,'TestEmployee') ");
            int res1 = stmt.executeUpdate("insert into emp(empno,ename) values(1012,'TestEmployee') ");
            int res2 = stmt.executeUpdate("insert into emp(empno,ename) values(1010,'TestEmployee') ");
            conn.commit();
            System.out.println(res + " Records Inserted");
            System.out.println(res1 + " Records Inserted");
            System.out.println(res2 + " Records Inserted");
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            conn.rollback();
            System.out.println(e.getMessage());
        }
    }
}
