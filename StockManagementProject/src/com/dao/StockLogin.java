package com.dao;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class StockLogin {
	public static void Login() {
        Scanner scanner = new Scanner(System.in);
       
        String customerIdPattern = "^[A-Za-z0-9]{6}$";       
        String yesNoPattern = "^(yes|no)$"; 
        String customerId;
        do {
            System.out.print("Enter your customer ID (6 alphanumeric characters): ");
            customerId = scanner.nextLine();
        } while (!validateInput(customerId, customerIdPattern));
        
        String regularCustomer;
        do {
            System.out.print("Are you a regular customer? (yes/no): ");
            regularCustomer = scanner.nextLine().toLowerCase();
        } while (!validateInput(regularCustomer, yesNoPattern));
        System.out.println("Logged in with Customer ID: " + customerId);
        System.out.println("Regular customer: " + regularCustomer);
        
    }
    public static boolean validateInput(String input, String pattern) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        return m.matches();
    }
}

