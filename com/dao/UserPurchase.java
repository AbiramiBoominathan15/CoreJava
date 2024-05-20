package com.dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

import com.model.Item;
import com.util.StockManagementConnection;

public class UserPurchase extends Item{
	public static int productQuantity;
	public static double price;

	public static void enterPurchaseDetails(Item item) throws ClassNotFoundException, SQLException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("_______________________________________________________________________________________");
		System.out.println("\tchoose the section \n\n*MasalaPowder,\n*cosmetics,\n*stationary");
		System.out.println("\nEnter section name:\n");
		String sectionName = scanner.nextLine();
		System.out.println(sectionName);
		item.setSectionName(sectionName);
		item.setOrderDate(new Date());
		System.out.println(item.toString());
	
		
		int totalProduct = 0;
		switch (sectionName) {
		case "MasalaPowder":
			System.out
					.println("--------------------------------------------------------------------------------------");
			System.out.println("Rasampowder\t SambarPowder\t Rice Powder\t CurryLeavesPowder\t TurmericPowder");
			System.out
					.println("---------------------------------------------------------------------------------------");
			System.out.println("Enter Product name:\n");
			String itemName = scanner.nextLine();
			item.setName(itemName);
			double price;
			switch (itemName) {
			case "Rasampowder":
				System.out.println("\nEnter numberofproduct:");
				productQuantity = scanner.nextInt();
				item.setProductQuantity(productQuantity);
				price = 25;
				totalProduct = 1000;
				item.setPrice(price);
				item.settotalPowder(totalProduct);
				
				
				break;
			case "SambarPowder":
				System.out.println("\nEnter numberofproduct:");
				productQuantity = scanner.nextInt();
				item.setProductQuantity(productQuantity);

				price = 35;
				totalProduct = 2000;
				item.setPrice(price);
				item.settotalPowder(totalProduct);
				break;
			case "RicePowder":
				System.out.println("\nEnter numberofproduct:");
				productQuantity = scanner.nextInt();
				item.setProductQuantity(productQuantity);

				price = 40;
				totalProduct = 3000;
				item.setPrice(price);
				item.settotalPowder(totalProduct);
				break;
			case "CurryLeavesPowder":
				System.out.println("\nEnter numberofproduct:");
				productQuantity = scanner.nextInt();
				item.setProductQuantity(productQuantity);

				price = 40;
				totalProduct = 2500;
				item.setPrice(price);
				item.settotalPowder(totalProduct);
				break;
			case "TurmericPowder":
				System.out.println("\nEnter numberofproduct:");
				productQuantity = scanner.nextInt();
				item.setProductQuantity(productQuantity);

				price = 40;
				totalProduct = 1500;
				item.setPrice(price);
				item.settotalPowder(totalProduct);
				break;
			default:
				System.out.println("Invalid choice");
				return;
			}
			break;
		case "cosmetics":
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("Lipstick | \t eyeliner |\t powder|\t RosePowder|\t Hairstraightner|");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("\tEnter Product name:\n");
			String itemName1 = scanner.nextLine();
			item.setName(itemName1);
			//double price;
			switch (itemName1) {
			case "Lipstick":
				System.out.println("\nEnter numberofproduct:");
				productQuantity = scanner.nextInt();
				item.setProductQuantity(productQuantity);

				price = 200;
				totalProduct = 2000;
				item.setPrice(price);
				item.settotalPowder(totalProduct);
				break;
			case "eyeliner":
				System.out.println("\nEnter numberofproduct:");
				productQuantity = scanner.nextInt();
				item.setProductQuantity(productQuantity);

				price = 155;
				totalProduct = 3000;
				item.setPrice(price);
				item.settotalPowder(totalProduct);

				break;
			case "powder":
				System.out.println("\nEnter numberofproduct:");
				productQuantity = scanner.nextInt();
				item.setProductQuantity(productQuantity);

				price = 50;
				totalProduct = 4000;
				item.setPrice(price);
				item.settotalPowder(totalProduct);
				break;
			case "RosePowder":
				System.out.println("\nEnter numberofproduct:");
				productQuantity = scanner.nextInt();
				item.setProductQuantity(productQuantity);

				price = 105;
				totalProduct = 5000;
				item.setPrice(price);
				item.settotalPowder(totalProduct);
				break;
			case "Hairstraightner":
				System.out.println("\nEnter numberofproduct:");
				productQuantity = scanner.nextInt();
				item.setProductQuantity(productQuantity);

				price = 2000;
				totalProduct = 2000;
				item.setPrice(price);
				item.settotalPowder(totalProduct);
				break;
			default:
				System.out.println("Invalid choice");
				return;
			}
			item.setPrice(price);
			break;
		case "stationary":
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("pen | \tpencil | \t rubber | \tscale | \tbox\t | Note |\tBook");
			System.out.println("-------------------------------------------------------------------------------");

			System.out.println("\nEnter Product name:\n");
			String productName = scanner.nextLine();
			item.setName(productName);
			//double price11;
			switch (productName) {
			case "pen":
				System.out.println("\nEnter numberofproduct:");
				productQuantity = scanner.nextInt();
				item.setProductQuantity(productQuantity);

				price = 25;
				totalProduct = 1500;
				item.setPrice(price);
				item.settotalPowder(totalProduct);
				break;
			case "pencil":
				System.out.println("\nEnter numberofproduct:");
				productQuantity = scanner.nextInt();
				item.setProductQuantity(productQuantity);

				price = 35;
				totalProduct = 1100;
				item.setPrice(price);
				item.settotalPowder(totalProduct);
				break;
			case "rubber":
				System.out.println("\nEnter numberofproduct:");
				productQuantity = scanner.nextInt();
				item.setProductQuantity(productQuantity);

				price= 40;
				totalProduct = 1220;
				item.setPrice(price);
				item.settotalPowder(totalProduct);
				break;
			case "scale":
				System.out.println("\nEnter numberofproduct:");
				productQuantity = scanner.nextInt();
				item.setProductQuantity(productQuantity);

				price = 20;
				totalProduct = 1222;
				item.setPrice(price);
				item.settotalPowder(totalProduct);
				break;
			case "box":
				System.out.println("\nEnter numberofproduct:");
				productQuantity = scanner.nextInt();
				item.setProductQuantity(productQuantity);

				price = 60;
				totalProduct = 1350;
				item.setPrice(price);
				item.settotalPowder(totalProduct);
				break;
			case "Note":
				System.out.println("\nEnter numberofproduct:");
				productQuantity = scanner.nextInt();
				item.setProductQuantity(productQuantity);

				price = 80;
				totalProduct = 1100;
				item.setPrice(price);
				item.settotalPowder(totalProduct);
				break;
			case "Book":
				System.out.println("\nEnter numberofproduct:");
				productQuantity = scanner.nextInt();
				item.setProductQuantity(productQuantity);

				price = 180;
				totalProduct = 1300;
				item.setPrice(price);
				item.settotalPowder(totalProduct);
				break;
			default:
				System.out.println("Invalid choice");
				return;
			}
			item.setPrice(price);
			break;
		default: {
			System.out.println("non of the section in our shop");
			break;
		}
		}
		StockManagementConnection.userDetails(item.getName(), item.getProductQuantity(), item.gettotalPowder(),
				item.getSectionName(), item.getPrice());
	}
}
