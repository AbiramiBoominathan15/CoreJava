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

    public static void insertuser(String customerId, String regularCustomer, String sectionName,String username, String password)
    
    		throws ClassNotFoundException, SQLException {
    	System.out.printf(customerId,regularCustomer,sectionName,username,password);
        Connection connection = StockManagementConnection.getConnection();
     String insertQuery = "INSERT INTO StockProject VALUES (?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        preparedStatement.setString(1, customerId);
        preparedStatement.setString(2, regularCustomer);
        preparedStatement.setString(3, sectionName);
        preparedStatement.setString(4, username);
        preparedStatement.setString(5, password);
        int rows = preparedStatement.executeUpdate();
        System.out.println(rows + " rows inserted");
    }

//    public static void update() throws ClassNotFoundException, SQLException {
//        Connection connection = getConnection();
//        String query = " UPDATE StockProject SET customerId= 'abi124'  WHERE sectionName = 'stationary';   \r\n" + "";
//        PreparedStatement p = connection.prepareStatement(query);
//        System.out.println("Final Table update");
//        p.execute();
//        connection.close();
//    }

//    public static void delete() throws ClassNotFoundException, SQLException {
//        Connection connection = getConnection();
//        String query = " DELETE FROM StockProject WHERE sectionName='MasalaPowder';\r\n" + "";
//        PreparedStatement p = connection.prepareStatement(query);
//        System.out.println("Final Table delete");
//        p.execute();
//        connection.close();
//    }
//    
    // public static void read() throws ClassNotFoundException, SQLException {
    // Connection connection = getConnection();
    // String query ="Select * from stockinsert where customerIdPatter=abi123" ;
    // PreparedStatement p = connection.prepareStatement(query);
    // String customerIdPattern= get.
    // p.execute();
    // connection.close();
    // }
   // public static void register()throws ClassNotFoundException, SQLException{
    //	Connection connection= getConnection();
    //}
//  public  static void register(String username, String password)
//            throws ClassNotFoundException, SQLException {
//        Connection connection = getConnection();
//        String insertQuery = "insert INTO StockProject  (username, password) VALUES (?, ?)";
//        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
//        preparedStatement.setString(1, username);
//        preparedStatement.setString(2, password);
//        int rows = preparedStatement.executeUpdate();
//        System.out.println(rows + " rows inserted for user " +username);
//        connection.close();
//    }
   public static void read(String username,String password,String regularCustomer,String sectionName) throws ClassNotFoundException, SQLException{         
        Connection connection = getConnection();
      System.out.println(connection);
      String save="SELECT *FROM StockProject WHERE customerId='abi123'";
      PreparedStatement prepareStatement = connection.prepareStatement(save);
      Statement stmt = connection.createStatement();
      ResultSet rows = stmt.executeQuery(save);
      while (rows.next()) {
          int id = rows.getInt("customerId");
           username = rows.getString(username);
           regularCustomer= rows.getString(regularCustomer);
           password = rows.getString(password);
           sectionName= rows.getString(sectionName);
          System.out.println("Retrieved Data");
          System.out.println(" Name : " + username
                  + "\t\t password : " + password+"\tregularCustomer "+regularCustomer+"\tsectionName:"+sectionName);
      }
      
System.out.println(rows+" retrieved");
}


}

