package com.program.art.refactor;

/**
 * OrderReceipt prints the details of order including customer name, address, description, quantity,
 * price and amount. It also calculates the sales tax @ 10% and prints as part
 * of order. It computes the total order amount (amount of individual lineItems +
 * total sales tax) and prints it.
 * 
 */
public class OrderReceipt {
	public static final double SALES_TAX_RATE = .10;
	private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
	}

	public String printReceipt() {
		StringBuilder output = new StringBuilder();

		// print headers
		output.append("====== Order Receipt ======\n");

		// print date, bill no, customer name
        output.append(order.getCustomerName());
        output.append(order.getCustomerAddress());

		// prints lineItems
		output.append("\n ------ Products ------\n");
		double totalSalesTax = 0d;
		double totalAmount = 0d;
		for (LineItem lineItem : order.getLineItems()) {
			output.append(lineItem.getDescription());
			output.append('\t');
			output.append(lineItem.getPrice());
			output.append('\t');
			output.append(lineItem.getQuantity());
			output.append('\t');
			output.append(lineItem.totalAmount());
			output.append('\n');

			// calculate sales tax @ rate of 10%
			double salesTax = lineItem.totalAmount() * SALES_TAX_RATE;
			totalSalesTax += salesTax;

			// calculate total amount of lineItem = price * quantity + 10 % sales tax
			totalAmount += lineItem.totalAmount() + salesTax;
		}

		// prints the state tax
		output.append('\n').append("Sales Tax").append('\t').append(totalSalesTax).append('\n');

		// print total amount
		output.append("Total Amount").append('\t').append(totalAmount);
		return output.toString();
	}
}