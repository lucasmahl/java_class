package entities;

public class Product {

	public String name;
	public double price;
	public double quantity = 0;

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		// this.quantity = quantity da classe
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + "," + " $ " + String.format("%.2f", price) + ", quantidade " + String.format("%.0f", quantity);
	}
}
