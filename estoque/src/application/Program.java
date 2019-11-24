package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();

		System.out.println("Enter product data: ");

		System.out.print("Name: ");
		product.name = sc.nextLine();

		System.out.println("Price: ");
		product.price = sc.nextDouble();

		System.out.println("Quantity: ");
		product.quantity = sc.nextDouble();

		System.out.print("Produtos a serem adicionados: ");
		int quantity = sc.nextInt();
		
		product.addProducts(quantity);
		
		System.out.println("Produtos a rerem removidos: ");
		quantity = sc.nextInt();
		
		product.removeProducts(quantity);
		
		// chama o toString
		System.out.println("Product data: " + product);
		sc.close();
	}

}
