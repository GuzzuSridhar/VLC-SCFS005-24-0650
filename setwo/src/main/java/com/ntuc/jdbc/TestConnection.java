package com.ntuc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdata", "root", "pass")) {
            assert conn != null : "No Connection";
            System.out.println("Connected");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Connection getMyConnection(String uname, String pwd) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdata", uname, pwd)) {
            assert con != null : "No Connection";
            return con;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
