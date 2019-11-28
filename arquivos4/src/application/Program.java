package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o caminho do arquivo: ");
		String strPath = sc.nextLine();

		// file pode ser caminho de arquivo ou pasta
		File path = new File(strPath);

		// pegando todas as pastas do caminho informado
		// lista somente diretorios
		File[] folders = path.listFiles(File::isDirectory);

		System.out.println("Folders:");
		for (File f : folders) {
			System.out.println(f);
		}

		// apenas pastas
		File[] files = path.listFiles(File::isFile);

		System.out.println("\nFiles:");
		for (File f : files) {
			System.out.println(f);
		}

		//criando subpasta
		boolean success = new File(strPath + "\\subpasta").mkdir();
		System.out.println("Deiretório criado com sucesso!" + success);
		
		sc.close();
	}

}
