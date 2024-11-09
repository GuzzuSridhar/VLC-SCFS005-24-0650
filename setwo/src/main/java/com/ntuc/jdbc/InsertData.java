package com.ntuc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdata", "root", "pass");
            Statement stmt = conn.createStatement();
            String sql = "insert into emp(empno,ename) values(100,'Alex')";
            System.out.println(sql);
            int res = stmt.executeUpdate(sql);
            System.out.println(res + " rows inserted");
            // stmt.execute(sql); // the # records affected will not be available
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
