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
            PreparedStatement stmt = conn.prepareStatement("select * from emp where empno = ? or ename = ?");
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a Employee number: ");
            int num = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter a Employee name: ");
            String name = scan.nextLine();
            stmt.setInt(1, num);
            stmt.setString(2, name);
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
