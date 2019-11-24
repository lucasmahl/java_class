package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Alex",0.0);
		BusinessAccount bacc = new BusinessAccount(2002, "Marco", 0.0, 500.0);
		
		//UPCASTING
		Account acc1 = bacc;
		acc1.getBalance(); 
		Account acc2 = new BusinessAccount(3003, "Maria", 1000.0, 1000);
		Account acc3 = new SavingsAccount(4004, "Luck", 15000.99, .01);
		
		//DOWNCASTING
		BusinessAccount bacc2 = (BusinessAccount)acc2; //tem q fazer casting manual
		bacc2.loan(100.0);
		
		//BusinessAccount bacc3 = (BusinessAccount)acc3;//gera erro
		if (acc3 instanceof BusinessAccount) {
			//não será executado este if
			BusinessAccount bacc3 = (BusinessAccount)acc3;
			bacc3.loan(100.0);
			System.out.println("Emprestou!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc4 = (SavingsAccount)acc3;
			acc4.updateBalance();
			System.out.println("Updated!");
		}
		
		
		//TESTANDO O METÓDO WITHDRAW OVERRIDED DO SAVINGSACCOUNT
		Account account = new Account(5005, "Jhonny", 1000.0);
		
		account.withdraw(200.0);
		System.out.println(account.getBalance());//795 por causa do desconto do saque
		
		Account svaccount = new SavingsAccount(6006, "Fulano", 1000.00, 0.01);
		svaccount.withdraw(200);
		System.out.println(svaccount.getBalance());//800, pq não tem desconto nenhum
		
		Account account2 = new BusinessAccount(7007, "Bob", 1000.0, 500.0);
		account2.withdraw(200.0);
		System.out.println(account2.getBalance());//1000 - 200 - 5 - 2 = 793

	}

}
