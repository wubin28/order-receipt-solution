package com.program.art.refactor;

import java.util.List;

public class Order {
    String customerName;
    String address;
    List<LineItem> lineItems;

    public Order(String customerName, String address, List<LineItem> lineItems) {
        this.customerName = customerName;
        this.address = address;
        this.lineItems = lineItems;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return address;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    double totalSalesTax() {
        double totalSalesTax = 0d;
        for (LineItem lineItem : getLineItems()) {
            double salesTax = lineItem.salesTax();
            totalSalesTax += salesTax;
        }
        return totalSalesTax;
    }

    double totalAmount() {
        double totalAmount = 0d;
        for (LineItem lineItem : getLineItems()) {
            totalAmount += lineItem.totalAmount() + lineItem.salesTax();
        }
        return totalAmount;
    }
}
