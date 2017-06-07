package com.program.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstExample {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Found");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost/test", "root", "Sairam123");
			System.out.println("Connection formed");
			Statement statement = con.createStatement();
			String sql = "create table Employee(id int,name varchar(50))";
			statement.executeUpdate(sql);
			System.out.println("Table created");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
