package com.test;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;
import java.util.function.Supplier;

import com.dao.Purchase;
import com.dao.StockLogin;
import com.model.Item;
import com.util.StockManagementConnection;
public class ProjectStockManagement {
	int totalPowder;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int num_product;
		ProjectStockManagement stock = new ProjectStockManagement();
		System.out.println("\t\t***Stock Management Details***\t\t");
		StockLogin login = new StockLogin();
		String customerId = "";
		String regularCustomer = "";
		Item login2 = StockLogin.Login();
		StockLogin.validateInput(customerId, regularCustomer);
		com.dao.Supplier supplier = new com.dao.Supplier();
		Purchase purchase = new Purchase();
		Item item = new Item();
		Scanner sc = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("_______________________________________________________________________________________");
		System.out.println("\tchoose the section \n\n*MasalaPowder,\n*cosmetics,\n*stationary");
		String[] str = { "MasalaPowder", "cosmetics", "stationary" };
		System.out.println("Enter section name:");
		String sectionName = sc.nextLine();
		System.out.println(sectionName);
		item.setSectionName(sectionName);
		item.setOrderDate(new Date());
		System.out.println(item.toString());
		int totalPowder = 0;
		switch (sectionName) {
		case "MasalaPowder":
			System.out
					.println("--------------------------------------------------------------------------------------");
			System.out.println("Rasampowder\t SambarPowder\t Rice Powder\t CurryLeavesPowder\t TurmericPowder");
			System.out
					.println("---------------------------------------------------------------------------------------");
			System.out.println("Enter Product name:");
			String itemName = sc.nextLine();
			item.setName(itemName);
			System.out.println("Enter Quantity(Gram):");
			int quantity = sc.nextInt();
			System.out.println("quantity:" + quantity);
			double price;
			switch (itemName) {
			case "Rasampowder":
				price = 25;
				totalPowder = 1000;
				item.setPrice(price);
				item.settotalPowder(totalPowder);
				break;
			case "SambarPowder":
				price = 35;
				totalPowder = 2000;
				item.setPrice(price);
				item.settotalPowder(totalPowder);
				break;
			case "RicePowder":
				price = 40;
				totalPowder = 3000;
				item.setPrice(price);
				item.settotalPowder(totalPowder);
				break;
			case "CurryLeavesPowder":
				price = 40;
				totalPowder = 2500;
				item.setPrice(price);
				item.settotalPowder(totalPowder);
				break;
			case "TurmericPowder":
				price = 40;
				totalPowder = 1500;
				item.setPrice(price);
				item.settotalPowder(totalPowder);
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
			System.out.println("\tEnter Product name:");
			String itemName1 = sc.nextLine();
			item.setName(itemName1);
			double price1;
			switch (itemName1) {
			case "Lipstick":
				price1 = 200;
				totalPowder = 2000;
				item.setPrice(price1);
				item.settotalPowder(totalPowder);
				break;
			case "eyeliner":
				price1 = 155;
				totalPowder = 3000;
				item.setPrice(price1);
				item.settotalPowder(totalPowder);

				break;
			case "powder":
				price1 = 50;
				totalPowder = 4000;
				item.setPrice(price1);
				item.settotalPowder(totalPowder);
				break;
			case "RosePowder":
				price1 = 105;
				totalPowder = 5000;
				item.setPrice(price1);
				item.settotalPowder(totalPowder);
				break;
			case "Hairstraightner":
				price1 = 2000;
				totalPowder = 2000;
				item.setPrice(price1);
				item.settotalPowder(totalPowder);
				break;
			default:
				System.out.println("Invalid choice");
				return;
			}
			item.setPrice(price1);
			break;
		case "stationary":
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("pen | \tpencile | \t rubber | \tscale | \tbox\t | Note |\tBook");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("\nEnter Product name:");
			String itemName11 = sc.nextLine();
			item.setName(itemName11);
			double price11;
			switch (itemName11) {
			case "pen":
				price11 = 25;
				totalPowder = 1500;
				item.setPrice(price11);
				item.settotalPowder(totalPowder);
				break;
			case "pencile":
				price11 = 35;
				totalPowder = 1100;
				item.setPrice(price11);
				item.settotalPowder(totalPowder);
				break;
			case "rubber":
				price11 = 40;
				totalPowder = 1220;
				item.setPrice(price11);
				item.settotalPowder(totalPowder);
				break;
			case "scale":
				price11 = 20;
				totalPowder = 1222;
				item.setPrice(price11);
				item.settotalPowder(totalPowder);
				break;
			case "box":
				price11 = 60;
				totalPowder = 1350;
				item.setPrice(price11);
				item.settotalPowder(totalPowder);
				break;
			case "Note":
				price11 = 80;
				totalPowder = 1100;
				item.setPrice(price11);
				item.settotalPowder(totalPowder);
				break;
			case "Book":
				price11 = 180;
				totalPowder = 1300;
				item.setPrice(price11);
				item.settotalPowder(totalPowder);
				break;
			default:
				System.out.println("Invalid choice");
				return;
			}
			item.setPrice(price11);
			break;
		default: {
			System.out.println("non of the section in our shop");
			break;
		}
		}
		System.out.println("\t Customer Details:");
		System.out.println("\nEnter numberofproduct:");
		int num_product1 = sc.nextInt();
		System.out.println("\nCustomer purchased product name:" + item.getName());
		// System.out.println("********");
		System.out.println("\n");
		System.out.println("\tSupplier Details");
		System.out.println("Supplier ID: " + item.getId());
		System.out.println("Itemname: " + item.getName());
		System.out.println("OrderDate: " + item.getOrderDate());
		System.out.println("\t_____________");
		System.out.println("\n");
		System.out.println(" \tPurchase Order Details");
		System.out.println("--------------------------");
		System.out.println("Purchase ID:" + item.getId());
		purchase.totalPrice(item.getPrice(), (int) num_product1);
		System.out.println("________________________");
		System.out.println(" \n \tAdmin Details");
		supplier.soldOutPockets(item.gettotalPowder(), num_product1, item.getSectionName(), item);
		supplier.noReturn();
		
		supplier.prepaidMoney();
	//	StockManagementConnection.insertuser(customerId,regularCustomer,sectionName);
		StockManagementConnection.insertuser(login2.getCustomerId(), login2.getRegularCustomer(),sectionName,login2.getUsername(),login2.getPassword());
		StockManagementConnection.read(login2.getUsername(),login2.getPassword(),login2.getRegularCustomer(),login2.sectionName);
		sc.close();
	}
}
