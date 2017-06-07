package com.program.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FourthExample {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Found");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost/test", "root", "Sairam123");
			System.out.println("Connection formed");
			String sql = "update Employee set name=? where id=?";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, "SaiNath");
			statement.setInt(2, 1);
			statement.executeUpdate();
			System.out.println("Successfully Updated");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
