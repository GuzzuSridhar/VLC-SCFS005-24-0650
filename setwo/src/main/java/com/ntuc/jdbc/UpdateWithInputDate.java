package com.ntuc.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UpdateWithInputDate {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdata", "root", "pass");

            Scanner input = new Scanner(System.in);
            System.out.print("Enter the Employee Number: ");
            int num = input.nextInt();
            input.nextLine();

            System.out.print("Enter the Employee Name: ");
            String name = input.nextLine();

            System.out.print("Enter the Employee' Date of Joining (YYYY-MM-DD): ");
            String doj = input.nextLine();
            LocalDate d = LocalDate.parse(doj, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            Statement stmt = conn.createStatement();
            String sql = "update emp set ename = '"
                    + name
                    + "' , doj = '"
                    + Date.valueOf(d)
                    + "' where empno ="
                    + num;

            System.out.println(sql);

            int res = stmt.executeUpdate(sql);
            System.out.println(res + " rows updated");

            stmt.close();
            conn.close();
            input.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
