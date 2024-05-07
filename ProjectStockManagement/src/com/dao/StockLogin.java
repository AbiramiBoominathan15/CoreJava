package com.dao;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.model.Item;
import com.util.StockManagementConnection;

public class StockLogin {
	public static Item Login() throws ClassNotFoundException, SQLException {
		Item item = new Item();
		Scanner scanner = new Scanner(System.in);
		String customerIdPattern = "^[A-Za-z0-9]{6}$";
		String yesNoPattern = "^(yes|no)$";
		String username = "^[a-zA-Z0-5]{10}$";
		String password = "^[A-Za-z0-9+_.-]{10}$";
		String regularCustomer;
		do {
			System.out.print("Are you a regular customer? (yes/no): ");
			regularCustomer = scanner.nextLine().toLowerCase();
			item.setRegularCustomer(regularCustomer);
			if (regularCustomer.equals("no")) {
				System.out.println("Please register to continue.");
				System.out.print("Enter a username: ");
				username = scanner.nextLine();
				item.setUsername(username);
				System.out.print("Enter a password: ");
				password = scanner.nextLine();
				item.setPassword(password);
				System.out.println(" set your customer ID :");
				String customerId = scanner.nextLine();
				item.setCustomerId(customerId);
				// System.out.println("id"+customerId);
				System.out.println("Logged in with Customer ID: " + item.getCustomerId());
				break;
			} else if (regularCustomer.equals("yes")) {
				String customerId;
				System.out.print("Enter your customer ID (6 alphanumeric characters): ");
				customerId = scanner.nextLine();
				while (true) {
					if (validateInput(customerId, customerIdPattern)) {
						item.setCustomerId(customerId);
						System.out.println("Logged in with Customer ID: " + item.getCustomerId());
						break;
					}
					System.out.println("Enter a valid input :");
					customerId = scanner.nextLine();
				}
			}
		} while (!validateInput(regularCustomer, yesNoPattern));

		System.out.println("Regular customer: " + regularCustomer);
		return item;
	}

	public static boolean validateInput(String input, String pattern) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(input);
		if (m.matches()) {
			return true;
		}
		return false;
	}
}
