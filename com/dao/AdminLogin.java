package com.dao;

import java.sql.SQLException;
import java.util.Scanner;
import com.model.Item;
import com.util.LoginValidation;
import com.util.StockManagementConnection;

public class AdminLogin {
	public static Item Login() throws ClassNotFoundException, SQLException {
		Item item = new Item();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String yesNoPattern = "^(yes|no)$";
		String username;
		String password;
		String regularCustomer;
		do {
			System.out.print("Existing admin or new admin type yes ");
			regularCustomer = scanner.nextLine().toLowerCase();
			item.setRegularCustomer(regularCustomer);
		} while (!LoginValidation.validateInput(regularCustomer, yesNoPattern));
		if (regularCustomer.equals("yes")) {
			while (true) {
				System.out.print("Enter your user name:\n");
				username = scanner.nextLine();
				System.out.println("Enter your password:\n");
				password = scanner.nextLine();
				if (StockManagementConnection.validateAdminLogin(username, password)) {
					System.out.println("Successfully login !!!\n");
					break;
				} else {
					System.out.println("Invalid username/Password !!!\n");
				}
			}
		}
		item.setIsValidUser(true);
		return item;
	}
}