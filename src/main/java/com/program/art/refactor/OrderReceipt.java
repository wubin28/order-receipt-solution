package com.program.art.refactor;

public class OrderReceipt {
	public static final double SALES_TAX_RATE = .10;
	private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
	}

	public String printReceipt() {
		StringBuilder output = new StringBuilder();

		output.append("====== Order Receipt ======\n");

        output.append(order.getCustomerName());
        output.append(order.getCustomerAddress());

		output.append("\n ------ Products ------\n");
		for (LineItem lineItem : order.getLineItems()) {
			output.append(lineItem.getDescription());
			output.append('\t');
			output.append(lineItem.getPrice());
			output.append('\t');
			output.append(lineItem.getQuantity());
			output.append('\t');
			output.append(lineItem.totalAmount());
			output.append('\n');
		}

		double totalAmount = order.totalAmount();

		output.append('\n').append("Sales Tax").append('\t').append(order.totalSalesTax()).append('\n');

		output.append("Total Amount").append('\t').append(totalAmount);
		return output.toString();
	}

}