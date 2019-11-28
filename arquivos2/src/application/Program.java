package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		String path = "c:\\temp\\in.txt";

		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			//stream de leitura de caracteres a partir de arquivos
			//fr = new FileReader(path);
			//deixa mais rápido a leitura
			//br = new BufferedReader(fr);
			
			//lê uma linha do arquivo
			String line = br.readLine();
			
			while ( line != null ) {
				System.out.println(line);
				
				//para pular linha e não cair no loop
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		
	}

}
