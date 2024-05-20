package com.test;
import java.sql.SQLException;

import com.dao.StockLogin;
import com.model.Item;
import com.util.StockManagementConnection;

public class ProjectStockManagement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//StockManagementConnection obj = new StockManagementConnection();
		Item item = new Item();
		System.out.println("\t\t***Stock Management Details***\t\t");
		Item login = StockLogin.Login();
		
		
		
		
		
		System.out.println(login);
		//StockManagementConnection.userDetails(item.getUsername(), item.getQuantity(), item.getTotalPowder(), item.getSectionName(), item.getPrice());
	}
}
