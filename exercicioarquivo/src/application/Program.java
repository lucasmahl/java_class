package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		String path = "c:\\temp\\in.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			ArrayList<String> lista = new ArrayList<String>();
			
			//caminho onde será criada a subpasta
			String strPath = "c:\\temp";
			
			//criando subpasta
			boolean success = new File(strPath + "\\out").mkdir();
			System.out.println("Deiretório criado com sucesso!" + success);
			
			//caminho\arquivo de saída
			String pathOut = "c:\\temp\\out\\out.csv";
			
			while (line!=null) {
				System.out.println(line);
				String[] parts = line.split(",");
				double valorMultiplicado = Double.parseDouble(parts[1]) * Double.parseDouble(parts[2]);
						
				System.out.println(parts[0] + ", R$ " +valorMultiplicado);
				//lê a próxima linha
				line = br.readLine();
				
				//FAZER METODO OUT
				//true para não recriar, insere da ultima linha em diante
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut, true))) {
					
						//escreve o arquivo
						bw.write(parts[0] + ", R$ " +valorMultiplicado);
						
						//quebra de linha
						bw.newLine();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		} catch (IOException e) {
			System.out.println("Erro: "+ e.getMessage());
		}
		
		
	}

}
