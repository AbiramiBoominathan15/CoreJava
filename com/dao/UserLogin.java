package com.dao;
import java.sql.SQLException;
import java.util.Scanner;
import com.model.Item;
import com.util.LoginValidation;
import com.util.StockManagementConnection;
public class UserLogin {

	public static Item Login() throws ClassNotFoundException, SQLException {
		Item item = new Item();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String yesNoPattern = "^(yes|no)$";
		String username;
		String password;
		String regularCustomer;
		do {
			System.out.print("Are you regular customer or not:? (yes/no):\n ");
			regularCustomer = scanner.nextLine().toLowerCase();
			item.setRegularCustomer(regularCustomer);
		} while (!LoginValidation.validateInput(regularCustomer, yesNoPattern));
		if (regularCustomer.equals("no")) {
			System.out.println("Please register to continue....");
			do {
	
				
				
				System.out.print("Enter a username: ");
				 username = scanner.nextLine();
				item.setUsername(username);
			} while (!LoginValidation.isValidUsername(item.getUsername()));
			do {
				System.out.print("Enter a password: ");
				password = scanner.nextLine();
				item.setPassword(password);
			} while (!LoginValidation.isValidPassword(item.getPassword()));
			StockManagementConnection.insertuser(item.getUsername(),
					item.getPassword());
			
			
			System.out.println("Account Created Successfully");
		} else if (regularCustomer.equals("yes")) {
			while (true) {
				System.out.print("Enter your user name:\n");
				username = scanner.nextLine();
				System.out.println("Enter your password:\n");
				password = scanner.nextLine();
				if (StockManagementConnection.validateUserLogin(username, password)) {
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