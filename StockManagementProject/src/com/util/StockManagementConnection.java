package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StockManagementConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/test_db_7", "root", "root");
		return connection;
	}

	public static void insertuser(String customerId, String regularCustomer, String sectionName)
			throws ClassNotFoundException, SQLException {
		Connection connection = StockManagementConnection.getConnection();
		String insertQuery = "INSERT INTO StockProject VALUES (?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
		preparedStatement.setString(1, customerId);
		preparedStatement.setString(2, regularCustomer);
		preparedStatement.setString(3, sectionName);
		int rows = preparedStatement.executeUpdate();
		System.out.println(rows + " rows inserted");
	}

	public static void update() throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		String query = " UPDATE   SET customerId= 'abi124'  WHERE sectionName = 'stationary';   \r\n" + "";
		PreparedStatement p = connection.prepareStatement(query);
		System.out.println("Final Table update");
		p.execute();
		connection.close();
	}

	public static void delete() throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		String query = " DELETE FROM StockProject WHERE sectionName='MasalaPowder';\r\n" + "";
		PreparedStatement p = connection.prepareStatement(query);
		System.out.println("Final Table delete");
		p.execute();
		connection.close();
	}
	// public static void read() throws ClassNotFoundException, SQLException {
	// Connection connection = getConnection();
	// String query ="Select * from stockinsert where customerIdPatter=abi123" ;
	// PreparedStatement p = connection.prepareStatement(query);
	// String customerIdPattern= get.
	// p.execute();
	// connection.close();
	// }
}
