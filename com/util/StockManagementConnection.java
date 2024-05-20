package com.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.dao.UserPurchase;

public class StockManagementConnection extends UserPurchase {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/test_db_10", "root", "root");
		return connection;
	}

	public static void insertuser(String username, String password) throws ClassNotFoundException, SQLException {

		System.out.printf(username, password);
		Connection connection = StockManagementConnection.getConnection();
		String insertQuery = "INSERT INTO StockProjectManagaement (username,password)VALUES (?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
		preparedStatement.setString(1, username);
		preparedStatement.setString(2, password);
		int rows = preparedStatement.executeUpdate();
	
		
		System.out.println(rows + " rows inserted");

	}

	public static void userDetails(String name, int productQuantity, int totalPowder, String sectionName, double price)
			throws ClassNotFoundException, SQLException {

		// System.out.printf(username, quantity,totalPowder,sectionName,price);
		System.out.printf("name: %s, productQuantity: %d, Total Powder: %d, Section Name: %s, Price: %.2f%n", name,
				productQuantity, totalPowder, sectionName, price);
		// System.out.printf(name, productQuantity,totalPowder,sectionName,price);
		Connection connection = StockManagementConnection.getConnection();
		String insertQuery = "INSERT INTO StockManagementUser (name,productQuantity,totalPowder,sectionName,price)VALUES (?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
		preparedStatement.setString(1, name);
		preparedStatement.setInt(2, productQuantity);
		preparedStatement.setInt(3, totalPowder);
		
		
		preparedStatement.setString(4, sectionName);
		preparedStatement.setDouble(5, price);

		int rows = preparedStatement.executeUpdate();
		System.out.println(rows + " rows inserted");

	}

	public static boolean validateUserLogin(String username, String password)
			throws ClassNotFoundException, SQLException {
		boolean isValidUser = false;
		Connection connection = getConnection();
		String save = "SELECT count(1) as \"COUNT\" FROM StockProjectManagaement WHERE username='" + username
				+ "' and password='" + password + "'";
		PreparedStatement prepareStatement = connection.prepareStatement(save);
		Statement stmt = connection.createStatement();
		ResultSet rows = stmt.executeQuery(save);
		if (rows.next()) {
			if (rows.getInt("COUNT") > 0) {
				isValidUser = true;
			}
		}
		connection.close();
		prepareStatement.close();
		rows.close();
		return isValidUser;
	}

//	public static void read(String customerId) throws ClassNotFoundException, SQLException {
//		Connection connection = getConnection();
//		System.out.println(connection);
//		String save = "SELECT * FROM StockProjectManagaement WHERE customerId='" + customerId + "'";
//		PreparedStatement prepareStatement = connection.prepareStatement(save);
//		Statement stmt = connection.createStatement();
//		ResultSet rows = stmt.executeQuery(save);
//		while (rows.next()) {
//			String id = rows.getString("customerId");
//			String username = rows.getString("username");
//			String regularCustomer = rows.getString("regularCustomer");
//			String password = rows.getString("password");
//			String sectionName = rows.getString("sectionName");
//			System.out.println("Retrieved Data");
//			System.out.println(" Name : " + username + "\t\t password : " + password + "\tregularCustomer "
//					+ regularCustomer + "\tsectionName:" + sectionName);
//		}
//		System.out.println(rows + " retrieved");
//		connection.close();
//		prepareStatement.close();
//		rows.close();
//	}
//	public static void read(String name,int productQuantity,int totalPowder,String sectionName,double price) throws ClassNotFoundException, SQLException {
//		Connection connection = getConnection();
//		System.out.println(connection);
////		String save = "SELECT * FROM StockManagementUser WHERE name='" + name + "'";
//		String save = "SELECT * FROM StockManagementUser WHERE name=" + name ;
//		PreparedStatement prepareStatement = connection.prepareStatement(save);
//		Statement stmt = connection.createStatement();
//		ResultSet rows = stmt.executeQuery(save);
//		while (rows.next()) {
//			 name = rows.getString("name");
//			 productQuantity = rows.getInt("productQuantity");
//		      totalPowder = rows.getInt("totalPowder");
//			 sectionName = rows.getString("sectionName");
//		      price = rows.getDouble("price");
//		}
//		System.out.println("Retrieved Data");
//		System.out.println(" Name : " + name+ "\t\t productQuantity : " + productQuantity + "\ttotalPowder "
//				+ totalPowder + "\tsectionName:" + sectionName+"\tprice:" + price);
//		System.out.println(rows + " retrieved");
//		connection.close();
//		prepareStatement.close();
//		rows.close();
//	}
	public static void read(String name, int productQuantity, int totalPowder, String sectionName, double price)
			throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		System.out.println(connection);
		String selectQuery = "SELECT * FROM StockManagementUser WHERE name=?";
		PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
		preparedStatement.setString(1, name);
		Statement stmt = connection.createStatement();
		ResultSet rows = stmt.executeQuery(selectQuery);
		while (rows.next()) {
			name = rows.getString(name);
			productQuantity = rows.getInt(productQuantity);
			totalPowder = rows.getInt(totalPowder);
			sectionName = rows.getString(sectionName);
			price = rows.getDouble("price");

			System.out.println("Retrieved Data");
			System.out.println("Name: " + name + "\tProduct Quantity: " + productQuantity + "\tTotal Powder: "
					+ totalPowder + "\tSection Name: " + sectionName + "\tPrice: " + price);
		}
		System.out.println(rows + " rows retrieved");
		connection.close();
		preparedStatement.close();
		rows.close();
	}

	public static void retreive(String name) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();

		System.out.println(connection);
		String selectQuery = "SELECT * FROM StockManagementUser ";

		PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
		Statement stmt = connection.createStatement();
		ResultSet rows = stmt.executeQuery(selectQuery);
		ResultSetMetaData set = rows.getMetaData();
		System.out.println("\n");
		System.out.println("____________________________________________________________________");
		for (int i = 1; i <= set.getColumnCount(); i++) {
			System.out.printf("%-15s", set.getColumnName(i));
		}
		System.out.println();
		System.out.println("____________________________________________________________________");
		System.out.println("\n");
		while (rows.next()) {
			for (int i = 1; i <= set.getColumnCount(); i++) {
				String value = rows.getString(i);
				System.out.printf("%-15s", value);
			}
			System.out.println();
			System.out.println("____________________________________________________________________");
			System.out.println("\n");

		}

	}

//			while (rows.next()) {
//			 name = rows.getString("name");
//			int productQuantity = rows.getInt("productQuantity");
//		int totalPowder = rows.getInt("totalPowder");
//			String sectionName = rows.getString("sectionName");
//			double price = rows.getDouble("price");
//
//			System.out.println("Retrieved Data");
//			System.out.println("Name: " + name + "\tProduct Quantity: " + productQuantity
//					+ "\tTotal Powder: " + totalPowder + "\tSection Name: " + sectionName
//					+ "\tPrice: " + price);
//		}
//		System.out.println(rows + " rows retrieved");
//		connection.close();
//		preparedStatement.close();
//		rows.close();
//}

	public static boolean validateAdminLogin(String username, String password)
			throws ClassNotFoundException, SQLException {
		boolean isValidUser = false;
		Connection connection = getConnection();
		String save = "SELECT count(1) as \"COUNT\" FROM Admin WHERE username='" + username + "' and password='"
				+ password + "'";
		PreparedStatement prepareStatement = connection.prepareStatement(save);
		Statement stmt = connection.createStatement();
		ResultSet rows = stmt.executeQuery(save);
		if (rows.next()) {
			if (rows.getInt("COUNT") > 0) {
				isValidUser = true;
			}
		}
		connection.close();
		prepareStatement.close();
		rows.close();
		return isValidUser;
	}

//	public static void adminUpadte()
//			throws ClassNotFoundException, SQLException {
//		Connection connection = getConnection();
//		System.out.println(connection);
//		String selectQuery = 	"UPDATE StockManagementUser  SET  totalPowder= '50000' WHERE name = 'rubber'";
//
//
//		PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
//		Statement stmt= connection.createStatement();
//		ResultSet rows = stmt.executeQuery(selectQuery);
//		connection.close();
//		preparedStatement.close();
//		rows.close();
//	}
	public static void adminUpdate() throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		System.out.println(connection);
		String updateQuery = "UPDATE StockManagementUser SET totalPowder = '5000' WHERE name = 'rubber'";

		PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
		int rowsUpdated = preparedStatement.executeUpdate(); // Use executeUpdate() for update queries

		System.out.println(rowsUpdated + " rows updated");

		connection.close();
		preparedStatement.close();
	}

}