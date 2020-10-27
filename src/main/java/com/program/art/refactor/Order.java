package com.program.art.refactor;

import java.util.List;
import java.util.stream.Collectors;

public class Order {
    String customerName;
    String address;
    List<LineItem> lineItems;

    public Order(String customerName, String address, List<LineItem> lineItems) {
        this.customerName = customerName;
        this.address = address;
        this.lineItems = lineItems;
    }

    double totalSalesTax() {
        return lineItems.stream().map(LineItem::salesTax).mapToDouble(n -> n).sum();
    }

    double totalAmount() {
        return lineItems.stream().map(LineItem::totalAmountWithSalesTax).mapToDouble(n -> n).sum();
    }

    String render() {
        StringBuilder output = new StringBuilder();

        output.append("====== Order Receipt ======\n");

        output.append(customerName);
        output.append(address);

        output.append("\n ------ Products ------\n");
        output.append(lineItems.stream().map(LineItem::render).collect(Collectors.joining()));

        output.append('\n').append("Sales Tax").append('\t').append(totalSalesTax()).append('\n');

        output.append("Total Amount").append('\t').append(totalAmount());
        return output.toString();
    }
}
