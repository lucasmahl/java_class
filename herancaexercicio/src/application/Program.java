package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> lista = new ArrayList<Product>();

		System.out.print("Número de produtos: ");
		Integer n = sc.nextInt();
		sc.nextLine();//quebralinha
		
		for (int i = 0; i < n; i++) {
			System.out.println( "Produto #" + (i+1) );
			System.out.print("Comum, usado ou importado (c,u,i): ");
			char tipo = sc.next().charAt(0);
			sc.nextLine();//quebralinha
			
			System.out.println("Nome do produto: ");
			String nomeProduto = sc.nextLine();
			
			System.out.println("Preço: ");
			double preco = sc.nextDouble();
			
			
			if (tipo == 'i') {
				System.out.print("Taxa de alfandega: ");
				double taxa = sc.nextDouble();			
				//Product pImportado = new ImportedProduct(nomeProduto, preco, taxa);
				
				lista.add(new ImportedProduct(nomeProduto, preco, taxa));
			}else if(tipo == 'u') {
				System.out.print("Data de manufatura: ");
				Date data = sdf.parse(sc.next());	
				//Product pUsed = new UsedProduct(nomeProduto, preco, data);
				
				lista.add(new UsedProduct(nomeProduto, preco, data));
			}else if(tipo == 'c'){
				//Product pNormal = new Product(nomeProduto, preco);
				lista.add(new Product(nomeProduto, preco));

			}
			
		}
		
		System.out.println("Price tags:");
		for (Product product : lista) {			
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}

}
