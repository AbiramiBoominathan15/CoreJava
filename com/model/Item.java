package com.model;

import java.util.Date;

public class Item {
	public int id;
	public String name;
	public double price;
	public int quantity;
	public int totalPowder;
	public String customerId;
	public String regularCustomer;
	public int productQuantity;
	public int totalPowder1;
	public String sectionName;
	public Date orderDate;
	public String password;
	public String username;
	public boolean isValidUser;

	
	
	
	public boolean getIsValidUser() {
		return isValidUser;
	}

	public void setIsValidUser(boolean isValidUser) {
		this.isValidUser = isValidUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return name;
	}

	public void setUsername(String username) {
		this.name = username;
	}

	
	
	

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", totalPowder="
				+ totalPowder + ", customerId=" + customerId + ", regularCustomer=" + regularCustomer
				+ ", productQuantity=" + productQuantity + ", totalPowder1=" + totalPowder1 + ", sectionName="
				+ sectionName + ", orderDate=" + orderDate + ", password=" + password + ", username=" + name
				+ ", getPassword()=" + getPassword() + ", getUsername()=" + getUsername() + ", getCustomerId()="
				+ getCustomerId() + ", getRegularCustomer()=" + getRegularCustomer() + ", getOrderDate()="
				+ getOrderDate() + ", getSectionName()=" + getSectionName() + ", getProductQuantity()="
				+ getProductQuantity() + ", getId()=" + getId() + ", getName()=" + getName() + ", getPrice()="
				+ getPrice() + ", getQuantity()=" + getQuantity() + ", gettotalPowder()=" + gettotalPowder() + "]";
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getRegularCustomer() {
		return regularCustomer;
	}

	public void setRegularCustomer(String regularCustomer) {
		this.regularCustomer = regularCustomer;
	}

	public java.util.Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	



	public Item(int id, String name, double price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public Item() {
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.matches("[a-zA-Z]+")) {
			this.name = name;
		} else {
			System.out.println("invalid name" + "Type only letters numbers are not allowed");
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void settotalPowder(int totalPowder) {
		this.totalPowder = totalPowder;
	}

	public int gettotalPowder() {
		return totalPowder;
	}

	public int getTotalPowder() {
		// TODO Auto-generated method stub
		return 0;
	}


}
