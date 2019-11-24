package entities;

public class Employee {
	private String nameEmployees;
	private Integer hours;
	private double valuePerHour;

	public Employee() {
		
	}

	public Employee(String nameEmployees, Integer hours, double valuePerHour) {
		this.nameEmployees = nameEmployees;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public String getNameEmployees() {
		return nameEmployees;
	}

	public void setNameEmployees(String nameEmployees) {
		this.nameEmployees = nameEmployees;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public double payment() {
		return hours * valuePerHour;
	}
}
