package entities;

//poupança
//finla pra evitar q ela seja herdada
public final class SavingsAccount extends Account {
	private Double interestRate;// juros

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	// atualiza saldo com base nos juros
	public void updateBalance() {
		balance += balance * interestRate;
	}

	//final no metodo pra evitar q ele seja sobrescrito
	@Override
	public final void withdraw(double amount) {
		balance -= amount;
	}
}
