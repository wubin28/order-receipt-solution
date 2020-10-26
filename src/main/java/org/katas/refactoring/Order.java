package org.katas.refactoring;

import java.util.List;
import java.util.stream.Collectors;

public class Order {
    String customerName;
    String customerAddress;
    List<LineItem> lineItems;

    public Order(String customerName, String customerAddress, List<LineItem> lineItems) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.lineItems = lineItems;
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

    public String receipt() {
        StringBuilder output = new StringBuilder();

        output.append("======Printing Orders======\n");

        output.append(customerName);
        output.append(customerAddress);

        output.append(lineItems.stream().map(LineItem::toString).collect(Collectors.joining()));

        output.append("Sales Tax").append('\t').append(totalSalesTax());
        output.append("Total Amount").append('\t').append(totalAmountOfLineItems());
        return output.toString();
    }
}
