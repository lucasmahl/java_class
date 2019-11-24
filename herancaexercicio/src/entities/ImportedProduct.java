package entities;

public final class ImportedProduct extends Product{
	private double customsfee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, double price, double customsfee) {
		super(name, price+customsfee);
		this.customsfee = customsfee;
	}

	public double getCustomsfee() {
		return customsfee;
	}

	public void setCustomsfee(double customsfee) {
		this.customsfee = customsfee;
	}
	
	@Override
	public final void setPrice(double price) {
		this.price = price + customsfee;
	}
	
	@Override
	public final String priceTag() {
		return super.priceTag() + "(Customs fee: " + customsfee +")" ;
	}
}
