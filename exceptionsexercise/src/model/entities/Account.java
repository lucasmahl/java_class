package model.entities;

import model.exceptions.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private double balance = 0;
	private double withdrawLimit;

	public Account() {

	}

	public Account(Integer number, String holder, double value, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		deposit(value);
		this.withdrawLimit = withdrawLimit;
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

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double value) {
		this.balance += value;
	}

	public void withDraw(double value) throws DomainException{
		if (value > withdrawLimit) {
			throw new DomainException("Valor inserido maior que o limite de saque.");
		}
		if (value > balance) {
			throw new DomainException("Valor inserido maior que saldo.");
		}
		if (balance == 0.0) {
			throw new DomainException("Não possui saldo.");
		}
		this.balance -= value;
	}

	
	@Override
	public String toString() {
		return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + ", withdrawLimit="
				+ withdrawLimit + "]";
	}

}
