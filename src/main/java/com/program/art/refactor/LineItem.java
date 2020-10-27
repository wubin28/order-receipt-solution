package com.program.art.refactor;

public class LineItem {
	private String description;
	private double price;
	private int quality;

	public LineItem(String description, double price, int quality) {
		super();
		this.description = description;
		this.price = price;
		this.quality = quality;
	}

	double totalAmount() {
        return price * quality;
    }

	double salesTax() {
		return totalAmount() * OrderReceipt.SALES_TAX_RATE;
	}

	String render() {
		return description + '\t' +
				price + '\t' +
				quality + '\t' +
				totalAmount() + '\n';
	}

	public double totalAmountWithSalesTax() {
		return totalAmount() + salesTax();
	}
}