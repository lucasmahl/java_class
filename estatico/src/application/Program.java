package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	// final pq � constante e n�o ir� mudar
	// PI EM MAIUSCULO PQ � CONSTANTE
	// se fosse + de 1 palavra, usaria underline
	// public static final double PI = 3.14159;

	// dentro de uma fun��o static, s� � aceita outra fun��o static
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		double c = Calculator.circumference(radius);

		double v = Calculator.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Pi: %.2f%n", Calculator.PI);

		sc.close();
	}

}
