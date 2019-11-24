package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.Empresa;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List<Contribuinte> lista = new ArrayList<Contribuinte>();

		System.out.print("Quantidade de contribuintes: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("Contribuinte #" + i);

			System.out.print("Pessoa fisica ou juridica (f/j): ");
			char p = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("Nome:");
			String nome = sc.nextLine();

			System.out.print("Renda anual:");
			double renda = sc.nextDouble();
			
			if (p == 'f') {
				
				System.out.print("Gastos com saude: ");
				double gastos = sc.nextDouble();
				
				lista.add(new Pessoa(nome, renda, gastos));
				
			} else if (p == 'j') {
				
				System.out.print("Quantidade de funcionários: ");
				Integer qtde= sc.nextInt();
				sc.nextLine();
				
				lista.add(new Empresa(nome, renda, qtde));
			}

		}

		System.out.println("Taxas:");
		for (Contribuinte c : lista) {
			System.out.printf("Nome %s, texa: R$%.2f%n",c.getNome(), c.taxa());
		}
		
		sc.close();
	}

}
