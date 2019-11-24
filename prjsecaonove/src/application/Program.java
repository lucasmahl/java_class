package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Conta c;

		System.out.print("Número da conta: ");
		int numero = sc.nextInt();
		sc.nextLine();
		c = new Conta(numero);
		System.out.println(c.toString());

		System.out.print("Nome do titular: ");
		String titular = sc.nextLine();
		c.setTitular(titular);
		System.out.println(c.toString());

		System.out.print("Deseja depositar(y/n)?");
		char resp = sc.next().charAt(0);

		double saldo;

		if (resp == 'Y' || resp == 'y') {
			System.out.println("Quanto deseja depositar: ");
			saldo = sc.nextDouble();
			c.deposita(saldo);
			System.out.println(c.toString());
		}

		System.out.print("Quanto deseja sacar: ");
		saldo = sc.nextDouble();
		c.retira(saldo);
		System.out.println(c.toString());

		sc.close();

	}

}
