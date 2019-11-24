package entities;

public class OutsourceEmployee extends Employee{
	private double additionalCharge;

	public OutsourceEmployee() {
		super();// para repetir alguma lógica da super classe, caso tenha
	}
	
	public OutsourceEmployee(String nameEmployees, Integer hours, double valuePerHour, double additionalCharge) {
		super(nameEmployees, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + (additionalCharge * 1.1); //adicional de 110%
	}
	
}
