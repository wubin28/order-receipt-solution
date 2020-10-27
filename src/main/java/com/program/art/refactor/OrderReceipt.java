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
			output.append(render(lineItem));
		}

		output.append('\n').append("Sales Tax").append('\t').append(order.totalSalesTax()).append('\n');

		output.append("Total Amount").append('\t').append(order.totalAmount());
		return output.toString();
	}

	private String render(LineItem lineItem) {
		return lineItem.getDescription() + '\t' +
				lineItem.getPrice() + '\t' +
				lineItem.getQuantity() + '\t' +
				lineItem.totalAmount() + '\n';
	}

}