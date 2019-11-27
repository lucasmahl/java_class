package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		try {
			System.out.println("Entre com os dados da conta: ");
			
			System.out.print("Número: ");
			int numero = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Nome do titular: ");
			String titular = sc.nextLine();
			
			System.out.print("Quanto deseja depositar: ");
			double valorinicial = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("Limite: ");
			double limite = sc.nextDouble();
			
			Account conta = new Account(numero, titular, valorinicial, limite);

			System.out.print("Quanto deseja sacar: ");
			conta.withDraw(sc.nextDouble());
			sc.nextLine();
			
			System.out.printf("Saldo: %.2f. %n", conta.getBalance());
			
			//tostring
			System.out.println(conta);
		}
		catch (InputMismatchException e) {
			//entra neste catch ao inserir casa decimal com ponto ou por letra no número da conta
			System.out.println("Forma de dado inválida.");
		}
		catch (DomainException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		finally {
			sc.close();
		}
		
	}

}
