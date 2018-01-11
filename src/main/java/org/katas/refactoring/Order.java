package org.katas.refactoring;

import java.util.List;

public class Order {
    String customerName;
    String customerAddress;
    List<LineItem> lineItems;

    public Order(String customerName, String customerAddress, List<LineItem> lineItems) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.lineItems = lineItems;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public double totalSalesTax() {
        double totalSalesTax = 0d;
        for (LineItem lineItem : lineItems) {
            double salesTax = lineItem.salesTax();
            totalSalesTax += salesTax;
        }
        return totalSalesTax;
    }

    public double totalAmountOfLineItems() {
        double totalAmountOfLineItems = 0d;
        for (LineItem lineItem : lineItems) {
            totalAmountOfLineItems += lineItem.totalAmount() + lineItem.salesTax();
        }
        return totalAmountOfLineItems;
    }
}
