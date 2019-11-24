package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product{
	private Date manufactureDate;
	private static SimpleDateFormat sdf = new SimpleDateFormat();

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name + "(used)", price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public final void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public final String priceTag() {
		return super.priceTag() + " (Manufacture Date: "+ sdf.format(manufactureDate) +")";
		
	}
	
	
	
}
