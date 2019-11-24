package appclication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// SEMPRE USAR O TIPO GENERICO (EXEMPLO: SHAPE), POR CAUSA DO POLIMORFISMO
		List<Shape> lista = new ArrayList<Shape>();

		System.out.println("Número de figuras");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("Figura #" + i);
			System.out.print("Retangulo ou circo (r/c): ");
			char tipo = sc.next().charAt(0);

			System.out.print("BLACK, BLUE OR RED: ");
			Color color = Color.valueOf(sc.next());

			if (tipo == 'c') {
				System.out.print("Raio: ");
				double r = sc.nextDouble();
				
				lista.add(new Circle(color, r));
				
			} else if (tipo == 'r') {
				
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				System.out.print("Altura: ");
				double altura = sc.nextDouble();

				lista.add(new Rectangle(color, largura, altura));
			}

		}
		
		System.out.println("Shape areas:");
		for (Shape s : lista) {			
			System.out.println( String.format("%.2f",s.area()) );
		}
		
		sc.close();

	}

}
