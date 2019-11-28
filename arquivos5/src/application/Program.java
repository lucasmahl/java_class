package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o caminho do arquivo: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);
		
		//pega o nome do arquivo digitado, com o caminho antes
		System.out.println("getName: " + path.getName());
		
		//pega o nome do caminho, sem o arquivo
		System.out.println("getParent: " + path.getParent());
		
		//pega o caminho com o nome do arquivo
		System.out.println("getParent: " + path.getPath());
		
		sc.close();
	}

}
