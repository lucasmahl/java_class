package entities;

public abstract class Account {
	private Integer number;
	private String holder;
	protected double balance;//para ser acessado pela subclasse

	public Account() {

	}

	public Account(Integer number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	// saque
	public void withdraw(double amount) {
		balance -= (amount + 5);
	}

	// deposito
	public void deposit(double amount) {
		balance += amount;
	}

	public double getBalance() {
		return balance;
	}

}
