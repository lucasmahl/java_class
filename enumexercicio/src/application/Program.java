package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.Enum.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
		//CLIENTE
		System.out.print("Nome do cliente: ");
		String clienteNome = sc.nextLine();
		//c1.setName(clienteNome);
		
		System.out.print("Email: ");
		String clienteEmail = sc.next();
		System.out.print("Aniversário (dd/mm/yyyy): ");
		String aniversario = sc.next();
		//c1.setBirthDay( sdf.parse(aniversario) );
		
		//ORDERSTATUS
		System.out.print("Status da ordem: ");
		String status = sc.next();
		//o1.setStatus(OrderStatus.valueOf(status));		

		//ORDEM
		Order o1 = new Order(new Client(clienteNome, clienteEmail, sdf.parse(aniversario)), OrderStatus.valueOf(status));
		//o1.getClient().setName("FULANO"); //TAMBÉM FUNCIONA 

		System.out.print("Quantidade de itens: ");
		int itens = sc.nextInt();
		sc.nextLine();//Pra considerar o enter clicado ao inserir o 
		
		for (int i = 0; i < itens; i++) {
			System.out.println("Nome do produto: ");
			String produtoNome = sc.nextLine();
			System.out.println("Preço: ");
			double produtoPreco = sc.nextDouble();
			System.out.println("Quantidade: ");
			int qtde = sc.nextInt();
			sc.nextLine();
			
			Product p = new Product(produtoNome, produtoPreco);
			OrderItem orderitem = new OrderItem(qtde, p.getPrice(), new Product(produtoNome , produtoPreco) );
			
			o1.addValorOrdem(orderitem.subTotal());
			
			o1.addItem(orderitem);
		}
		
		/*System.out.println(o1.getMoment());
		System.out.println(o1.getClient().getName());
		System.out.println(o1.getClient().getEmail());
		System.out.println( sdf.format(o1.getClient().getBirthDay()) );
		System.out.println(o1.getStatus());


		System.out.println(o1.getMoment());*/
		
		System.out.println(o1.toString());
		
		sc.close();

	}

}
