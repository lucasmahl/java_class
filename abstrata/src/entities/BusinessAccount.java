package entities;

public class BusinessAccount extends Account {
	// limite para empréstimo
	private double loanLimit;

	public BusinessAccount() {
		super();// para repetir alguma lógica da super classe, caso tenha
	}

	public BusinessAccount(Integer number, String holder, double balance, double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}

	// emprestar
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount -10;
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);//faz o withdraw com desconto, igual ao da Account
		balance -= 2.0; //desconta 2
	}

}
