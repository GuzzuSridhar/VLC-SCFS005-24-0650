package com.ntuc.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        Connection conn = TestConnection.getMyConnection("root", "pass");

        assert conn != null : "No Connection";
        String sql = "create table emp_one("
                + "empno int,"
                + "ename varchar(50))";
        try {
            Statement stmt = conn.createStatement();
            boolean isSuccess = stmt.execute(sql);
            if (isSuccess)
                System.out.println("The statement is a select");
            else {
                System.out.println("The statement is non select");

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
