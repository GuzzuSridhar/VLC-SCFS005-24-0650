package com.ntuc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SelectToList {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdata", "root", "pass");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from emp");
            while (rs.next()) {
                employees.add(new Employee(rs.getInt(1), rs.getString(2)));
            }
            rs.close();
            stmt.close();
            conn.close();
            for (Employee employee : employees) {
                System.out.println(employee);
            }

        } catch (SQLException e) {
            Logger.getLogger(SelectData.class.getName()).log(Level.SEVERE, "Error", e);
        }
    }
}
