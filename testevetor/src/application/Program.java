package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quartos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Quartos[] vect = new Quartos[10];

		for (int i = 0; i < 3; i++) {
			String cliente = sc.nextLine();
			int nQuarto = sc.nextInt();
			sc.nextLine();

			vect[nQuarto] = new Quartos(cliente, nQuarto);
		}

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println("Cliente: " + vect[i].getCliente() + ", no quarto: " + vect[i].getnQuarto());
			}
		}

		sc.close();
	}

}
