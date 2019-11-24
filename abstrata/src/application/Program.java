package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		//abstract não pode ser instanciada
		//Account acc1 = new Account(1001,"Alex", 1000.00);

		List<Account> lista = new ArrayList<Account>();
		
		lista.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		lista.add(new BusinessAccount(1002, "Maria", 1000.00, 400.00));
		lista.add(new SavingsAccount(1003, "Bob", 300.00, 0.01));
		lista.add(new BusinessAccount(1004, "Ana", 500.00, 500.00));

		//mostra a soma do saldo das contas instanciadas
		double sum = 0.0;
		for (Account account : lista) {
			sum += account.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		//faz um deposito em todas as contas
		for (Account account : lista) {
			account.deposit(10.0);
		}
		
		for (Account account : lista) {
			System.out.printf("Conta %d, Saldo: R$ %.2f%n", account.getNumber(), account.getBalance());
		}
	}

}
