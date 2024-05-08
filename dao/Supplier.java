package com.dao;
import com.dao.AbstractItem;
import com.dao.InterfaceItem;
import com.model.Item;
public class Supplier extends AbstractItem implements InterfaceItem {
    public void noReturn() {
        System.out.println("*Damaged pockets are cannot be accepted");
    }

    @Override
    public void soldOutPockets(int totalPowder1, int num_product1, String sectionName, Item item) {
        int soldOut1 = totalPowder1 - num_product1;
        String name = item.getName();
        System.out.println(
                "*Available Stocks are:" + soldOut1 + " " + name + " " + "Section Name:" + " " + item.getSectionName());
    }
    

    public void prepaidMoney() {
        System.out.println("*customer must pay their money previously");
    }
}
