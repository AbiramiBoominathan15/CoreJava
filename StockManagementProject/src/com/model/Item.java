package com.model;

import java.util.Date;

public class Item {
	public int id;
	public String name;
	public double price;
	public int quantity;
	public int totalPowder;
	public String customerIdPattern;
	public String yesNoPattern;
	public int num_product1;
	public int totalPowder1;
	public String sectionName;
	public Date orderDate;
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

	public void setYesNoPattern(String yesNoPattern) {
		if (yesNoPattern.matches("[a-z]+")) {
			this.yesNoPattern = yesNoPattern;
		} else {
			System.out.println("lowercase letters are only allowed");
		}
	}

	public String getYesNoPattern() {
		return yesNoPattern;
	}

	public void setCustomerIdPattern(String customerIdPattern) {
		if (customerIdPattern.matches("^[A-Za-z0-9]{6}$")) {
			this.customerIdPattern = customerIdPattern;
		} else {
			System.out.println("6 alphanumeric characters are allowed");
		}
	}

	public String getCustomerIdPattern() {
		return customerIdPattern;
	}

	public Item(int id, String name, double price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Item() {
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", totalPowder="
				+ totalPowder + ", customerIdPattern=" + customerIdPattern + ", yesNoPattern=" + yesNoPattern
				+ ", num_product1=" + num_product1 + ", totalPowder1=" + totalPowder1 + ", sectionName=" + sectionName
				+ ", orderDate=" + orderDate + ", getOrderDate()=" + getOrderDate() + ", getSectionName()="
				+ getSectionName() + ", getYesNoPattern()=" + getYesNoPattern() + ", getCustomerIdPattern()="
				+ getCustomerIdPattern() + ", getId()=" + getId() + ", getName()=" + getName() + ", getPrice()="
				+ getPrice() + ", getQuantity()=" + getQuantity() + ", gettotalPowder()=" + gettotalPowder() + "]";
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

}
