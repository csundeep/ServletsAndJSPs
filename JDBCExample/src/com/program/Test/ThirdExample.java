package com.program.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class ThirdExample {

	public static void main(String[] args) {
		Map<Integer, String> employees = new HashMap<Integer, String>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Found");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost/test", "root", "Sairam123");
			System.out.println("Connection formed");
			Statement statement = con.createStatement();
			String sql = "select id,name from Employee";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				employees.put(rs.getInt(1), rs.getString(2));
				// System.out.println("Id :" + rs.getInt(1));
				// System.out.println("Name :" + rs.getString(2));

			}
			for (Map.Entry<Integer, String> entry : employees.entrySet()) {
				System.out.println("Key = " + entry.getKey() + ", Value = "
						+ entry.getValue());
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
