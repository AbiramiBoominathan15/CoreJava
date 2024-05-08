package com.dao;

public class Purchase {
    int totalPowder11 = 0;
    public int totalPrice;
    static double discount = 0;

    
    public void totalPrice(double price, int num_product1) {
        double totalPrice = price * num_product1;
        System.out.println("Total price is " + totalPrice);
        if (totalPrice > 1000 && totalPrice < 1500) {
            discount = 0.05 * totalPrice;
            totalPrice -= discount;
            System.out.println("Give 5% discount: " + totalPrice);

        } else if (totalPrice >= 1500 && totalPrice < 3000) {
            discount = 0.1 * totalPrice;
            totalPrice -= discount;
            System.out.println("Give 10% discount: " + totalPrice);
        } else if (totalPrice >= 3000 && totalPrice < 5000) {
            discount = 0.15 * totalPrice;
            totalPrice -= discount;
            System.out.println("Give 15% discount: " + totalPrice);
        } else if (totalPrice >= 5000 && totalPrice < 10000) {
            discount = 0.2 * totalPrice;
            totalPrice -= discount;
            System.out.println("Give 20% discount: " + totalPrice);
        } else if (totalPrice >= 10000 && totalPrice <= 100000) {
            discount = 0.21 * totalPrice;
            totalPrice -= discount;
            System.out.println("Give 20% discount: " + totalPrice);
        } else {
            System.out.println("Discount not approved for your product, price is too low");
            System.out.println("Offers are only available with our coupon code");
        }
    }

}
