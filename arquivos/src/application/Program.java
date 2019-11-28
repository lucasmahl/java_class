package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		File file = new File("c:\\temp\\in.txt");

		// instancia o scanner a partir do arquivo, pode gerar ioexception
		Scanner sc = null;

		try {
			// pra evitar erro
			sc = new Scanner(file);

			// enquanto houver linha a ser lida
			while (sc.hasNextLine()) {
				// imprime linha por linha do arquivo
				System.out.println(sc.nextLine());

			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());

		}
		finally {
			//caso não seja instanciado o scanner
			if (sc != null) {
				sc.close();	
			}
			
		}

		

	}

}
