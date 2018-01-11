package org.katas.refactoring;

public class LineItem {
	public static final double SALES_TAX_RATE = .10;
	private final String description;
	private final double price;
	private final int quality;

	public LineItem(String description, double price, int quality) {
		super();
		this.description = description;
		this.price = price;
		this.quality = quality;
	}

    double totalAmount() {
        return price * quality;
    }

	public double salesTax() {
		return totalAmount() * SALES_TAX_RATE;
	}

	@Override
	public String toString() {
		return description + '\t' +
				price + '\t' +
				quality + '\t' +
				totalAmount() + '\n';
	}
}