package com.dao;

import java.sql.SQLException;
import java.util.Scanner;
import com.model.Item;
import com.util.StockManagementConnection;

public class StockLogin {
	public static Item Login() throws ClassNotFoundException, SQLException {
		int id = 101;
		int totalAmount;
		Supplier supplier = new Supplier();
		Purchase purchase = new Purchase();
		Item item = new Item();
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the login type: \n 1.user \n 2.admin \n");
		String loginType = sc.nextLine();
		System.out.println(loginType);
		if (loginType.equals("user")) {

			item = UserLogin.Login();
			if (item.getIsValidUser()) {
				UserPurchase.enterPurchaseDetails(item);

	
				
				System.out.println("\nCustomer Details:\n");
				System.out.println("\nCustomer purchased product name:" + item.getName());
				System.out.println("\n");
				System.out.println("\tSupplier Details");
				System.out.println("Supplier ID: " + id);
				System.out.println("Itemname: " + item.getName());
				System.out.println("OrderDate: " + item.getOrderDate());
				System.out.println("\t_____________");
				System.out.println("\n");
				System.out.println(" \tPurchase Order Details");
				System.out.println("--------------------------");
				System.out.println("Purchase ID:" + id);
				totalAmount = item.gettotalPowder() - item.getProductQuantity();
				System.out.println("Total Product" + totalAmount);
				purchase.totalPrice(item.getPrice(), (int) item.getProductQuantity());
				System.out.println("________________________");
			}

		} else if (loginType.equals("admin")) {
			System.out.println(" \n \tAdmin Details");
			AdminLogin.Login();
			// StockManagementConnection.userDetails(item.getName(),
			// item.getProductQuantity(),item.gettotalPowder(), item.getSectionName(),
			// item.getPrice());
			// StockManagementConnection.read(item.getName(),item.getProductQuantity(),item.getTotalPowder(),item.getSectionName(),item.getPrice());
			// supplier.soldOutPockets(item.gettotalPowder(), item.getProductQuantity(),
			// item.getSectionName(), item);
			// supplier.noReturn();
			// supplier.prepaidMoney();
			StockManagementConnection.retreive(item.getName());
			StockManagementConnection.adminUpdate();

		}

		return item;
	}

}
