package com.ntuc.jdbc.preparedstatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ntuc.jdbc.SelectData;

public class SelectRecords {
    public static void main(String[] args) {
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdata", "root", "pass");
            PreparedStatement stmt = conn.prepareStatement("select * from emp where empno = ?");
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a Employee number: ");
            int num = scan.nextInt();
            stmt.setInt(1, num);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.print(rs.getInt(1) + " - ");
                System.out.println(rs.getString(2));
            }

            stmt.close();
            conn.close();
            scan.close();

        } catch (SQLException e) {
            Logger.getLogger(SelectData.class.getName()).log(Level.SEVERE, "Error", e);
        }
    }
}
