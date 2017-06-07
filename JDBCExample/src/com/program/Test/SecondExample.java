package com.program.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SecondExample {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Found");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost/test", "root", "Sairam123");
			System.out.println("Connection formed");
			Statement statement = con.createStatement();
			String sql1 = "insert into Employee values(1,'Arun')";
			String sql2 = "insert into Employee values(2,'sandy')";
			String sql3 = "insert into Employee values(3,'Sai Kiran')";
			statement.executeUpdate(sql1);
			statement.executeUpdate(sql2);
			statement.executeUpdate(sql3);
			System.out.println("inserted data");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
