package com.program.art.refactor;

public class OrderReceipt {
	public static final double SALES_TAX_RATE = .10;
	private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
	}

	public String printReceipt() {
		return order.render();
	}

}