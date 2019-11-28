package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Program {

	public static void main(String[] args) {
		String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa noite"};
		
		String path = "c:\\temp\\out.txt";
		
		//true para não recriar, insere da ultima linha em diante
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String l : lines) {
				//escreve o arquivo
				bw.write(l);
				
				//quebra de linha
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
