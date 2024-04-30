package com.employee1.connection;
import java.sql.DriverManager;
import java.util.*;
import java.sql.SQLException;
import java.sql.*;
public class DatabaseConnect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		System.out.println(connection);
		update();
		insert();
		delete();
	}
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/test_db_3", "root", "root");
		return connection;
	}
	public static void update() throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		String query = " UPDATE  employee SET email= 'vignesh@gmail.com'  WHERE employee_name= 'vignesh';   \r\n" + "";
		PreparedStatement p = connection.prepareStatement(query);
		System.out.println("Final Table update");
		p.execute();
		connection.close();
	}
	public static void insert() throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		String query = "insert into employee value('21000','ramya','3667','ramya15@gmail.com')";
		PreparedStatement p = connection.prepareStatement(query);
		System.out.println("Final Table insert");
		p.execute();
		connection.close();
	}
	public static void delete() throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		String query = "DELETE FROM employee WHERE employee_name ='vinoth'";
		PreparedStatement p = connection.prepareStatement(query);
		System.out.println("Final Table delete ");
		p.execute();
		connection.close();
	}
}