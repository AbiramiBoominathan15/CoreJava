package com.test;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;
import com.dao.Purchase;
import com.dao.StockLogin;
import com.util.StockManagementConnection;

public class ProjectStockManagement {
	int totalPowder;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int num_product;
		ProjectStockManagement stock = new ProjectStockManagement();
		System.out.println("\t\t***Stock Management Details***\t\t");
		StockLogin login= new StockLogin();
		String customerId="" ;
		String regularCustomer="";
		login.Login();
		login.validateInput(customerId, regularCustomer);
		com.dao.Supplier supplier = new com.dao.Supplier();
		Purchase purchase = new Purchase();
		com.model.Item item = new com.model.Item(1, null, 10.99, 100);
		Scanner sc = new Scanner(System.in);
	
	//	System.out.println("Enter CustomerID:");
		//String customerIdPattern = sc.nextLine();
		//item.setCustomerIdPattern(customerIdPattern);
		//System.out.print("Are you a regular customer? (yes/no): ");
		//String yesNoPattern = sc.nextLine();
		//item.setCustomerIdPattern(yesNoPattern);
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
		int totalPowder1 = 0;
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
				totalPowder1 = 1000;
				item.setPrice(price);
				item.settotalPowder(totalPowder1);
				break;
			case "SambarPowder":
				price = 35;
				totalPowder1 = 2000;
				item.setPrice(price);
				item.settotalPowder(totalPowder1);
				break;
			case "RicePowder":
				price = 40;
				totalPowder1 = 3000;
				item.setPrice(price);
				item.settotalPowder(totalPowder1);
				break;
			case "CurryLeavesPowder":
				price = 40;
				totalPowder1 = 2500;
				item.setPrice(price);
				item.settotalPowder(totalPowder1);
				break;
			case "TurmericPowder":
				price = 40;
				totalPowder1 = 1500;
				item.setPrice(price);
				item.settotalPowder(totalPowder1);
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
				totalPowder1 = 2000;
				item.setPrice(price1);
				item.settotalPowder(totalPowder1);
				break;
			case "eyeliner":
				price1 = 155;
				totalPowder1 = 3000;
				item.setPrice(price1);
				item.settotalPowder(totalPowder1);

				break;
			case "powder":
				price1 = 50;
				totalPowder1 = 4000;
				item.setPrice(price1);
				item.settotalPowder(totalPowder1);
				break;
			case "RosePowder":
				price1 = 105;
				totalPowder1 = 5000;
				item.setPrice(price1);
				item.settotalPowder(totalPowder1);
				break;
			case "Hairstraightner":
				price1 = 2000;
				totalPowder1 = 2000;
				item.setPrice(price1);
				item.settotalPowder(totalPowder1);
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
				totalPowder1 = 1500;
				item.setPrice(price11);
				item.settotalPowder(totalPowder1);
				break;
			case "pencile":
				price11 = 35;
				totalPowder1 = 1100;
				item.setPrice(price11);
				item.settotalPowder(totalPowder1);
				break;
			case "rubber":
				price11 = 40;
				totalPowder1 = 1220;
				item.setPrice(price11);
				item.settotalPowder(totalPowder1);
				break;
			case "scale":
				price11 = 20;
				totalPowder1 = 1222;
				item.setPrice(price11);
				item.settotalPowder(totalPowder1);
				break;
			case "box":
				price11 = 60;
				totalPowder1 = 1350;
				item.setPrice(price11);
				item.settotalPowder(totalPowder1);
				break;
			case "Note":
				price11 = 80;
				totalPowder1 = 1100;
				item.setPrice(price11);
				item.settotalPowder(totalPowder1);
				break;
			case "Book":
				price11 = 180;
				totalPowder1 = 1300;
				item.setPrice(price11);
				item.settotalPowder(totalPowder1);
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
		StockManagementConnection.insertuser(customerId, regularCustomer, sectionName);
		StockManagementConnection.update();
		StockManagementConnection.delete();
		sc.close();
	}
}
