package org.katas.refactoring;

public class LineItem {
	private final String description;
	private final double price;
	private final int quality;

	public LineItem(String description, double price, int quality) {
		super();
		this.description = description;
		this.price = price;
		this.quality = quality;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quality;
	}

    double totalAmount() {
        return price * quality;
    }

	public double salesTax() {
		// calculate sales tax @ rate of 10%
		return totalAmount() * .10;
	}
}